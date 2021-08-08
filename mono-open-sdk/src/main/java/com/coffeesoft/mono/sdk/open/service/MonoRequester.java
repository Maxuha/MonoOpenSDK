package com.coffeesoft.mono.sdk.open.service;

import com.coffeesoft.mono.sdk.open.dto.Currency;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface MonoRequester {
    @GET("/bank/currency")
    Call<List<Currency>> currency();
}
