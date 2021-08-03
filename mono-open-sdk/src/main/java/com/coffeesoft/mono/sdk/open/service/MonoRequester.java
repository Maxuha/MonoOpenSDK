package com.coffeesoft.mono.sdk.open.service;

import com.coffeesoft.mono.sdk.open.service.dto.Currency;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class MonoRequester {
    String API_URL = "https://api.monobank.ua/";
    MonoService monoService;

    public MonoRequester() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        monoService = retrofit.create(MonoService.class);
    }

    public List<Currency> currency() throws IOException {
        Call<List<Currency>> call = monoService.currency();
        return call.execute().body();
    }
}
