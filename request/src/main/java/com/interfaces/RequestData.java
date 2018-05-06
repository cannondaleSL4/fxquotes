package com.interfaces;

import com.dim.fxapp.entity.FinancialEntity;
import com.dim.fxapp.entity.enums.Currency;
import com.dim.fxapp.entity.impl.QuotesLive;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.*;

/**
 * Created by dima on 24.03.18.
 */
public abstract class RequestData<F extends FinancialEntity> {
    protected String messageError = "Server is not available";
    protected static CloseableHttpClient httpClient = HttpClients.createDefault();
    protected Map<String, Object> mapResp = new HashMap<>();
    protected Set<QuotesLive> localResp = new HashSet<>();
    protected HttpGet httpGet;
    protected Set<Currency> currencySet = new HashSet<Currency>(Arrays.asList(Currency.values()));
    public abstract Map<String,Object> getRequest();
}
