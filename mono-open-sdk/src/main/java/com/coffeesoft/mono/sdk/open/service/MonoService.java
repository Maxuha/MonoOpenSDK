package com.coffeesoft.mono.sdk.open.service;

import com.coffeesoft.mono.sdk.open.service.dto.Currency;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface MonoService {
    @GET("/bank/currency")
    Call<List<Currency>> currency();
}
