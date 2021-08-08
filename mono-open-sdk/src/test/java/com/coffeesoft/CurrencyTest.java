package com.coffeesoft;

import com.coffeesoft.mono.sdk.open.exception.MonoException;
import com.coffeesoft.mono.sdk.open.service.MonoService;
import com.coffeesoft.mono.sdk.open.service.MonoServiceImpl;
import com.coffeesoft.mono.sdk.open.dto.Currency;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {
    @Test
    public void testCount() throws MonoException {
        MonoService monoService = new MonoServiceImpl();
        List<Currency> currencies = monoService.currency();
        assertEquals("Size list currencies", 114, currencies.size());
    }
}
