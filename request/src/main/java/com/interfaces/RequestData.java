package com.interfaces;

import com.dim.fxapp.entity.FinancialEntity;
import com.dim.fxapp.entity.enums.Currency;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dima on 24.03.18.
 */
public abstract class RequestData<F extends FinancialEntity> {
    protected static CloseableHttpClient httpClient = HttpClients.createDefault();
    protected HttpGet httpGet;
    protected Set<Currency> currencySet = new HashSet<Currency>(Arrays.asList(Currency.values()));
    public abstract Map<String,Object> getRequest();
}
