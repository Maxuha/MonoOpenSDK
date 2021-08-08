package com.coffeesoft.mono.sdk.open.service;

import com.coffeesoft.mono.sdk.open.dto.Currency;
import com.coffeesoft.mono.sdk.open.exception.MonoException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class MonoServiceImpl implements MonoService {
    private String API_URL = "https://api.monobank.ua/";
    private final MonoRequester monoRequester;

    public MonoServiceImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        monoRequester = retrofit.create(MonoRequester.class);
    }

    public List<Currency> currency() throws MonoException {
        Call<List<Currency>> call = monoRequester.currency();
        try {
            Response<List<Currency>> response = call.execute();
            if (response.code() == 200) {
                return response.body();
            } else {
                throw new MonoException(response.errorBody().string(), response.code());
            }
        } catch (IOException e) {
            throw new MonoException(e);
        }
    }
}
