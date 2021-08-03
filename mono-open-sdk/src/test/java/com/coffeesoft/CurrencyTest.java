package com.coffeesoft;

import com.coffeesoft.mono.sdk.open.service.MonoRequester;
import com.coffeesoft.mono.sdk.open.service.dto.Currency;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {
    @Test
    public void testCount() throws IOException {
        MonoRequester requester = new MonoRequester();
        List<Currency> currencies = requester.currency();
        assertEquals("Size list currencies", 114, currencies.size());
    }
}
