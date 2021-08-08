package com.coffeesoft.mono.sdk.open.service;

import com.coffeesoft.mono.sdk.open.dto.Currency;
import com.coffeesoft.mono.sdk.open.exception.MonoException;

import java.util.List;

public interface MonoService {
    List<Currency> currency() throws MonoException;
}
