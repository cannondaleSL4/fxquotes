package com.execute;

import com.dim.fxapp.entity.enums.Currency;
import com.dim.fxapp.entity.impl.QuotesLive;
import com.exeption.ServerRequestExeption;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interfaces.RequestData;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dima on 24.03.18.
 */
public class RequestLiveQuotes extends RequestData<QuotesLive> {
    @Value("${currency.main}")
    protected String MAIN;

    private Map<String, Object> mapResp = new HashMap<>();

    private Map<String,Object> getLastForCurrentCurrency(String currency, String base, String name){
        httpGet = new HttpGet(String.format(MAIN,base,name));
        QuotesLive quotesLive = null;
        String messageError = "Server is not available";
        try(CloseableHttpResponse response =  httpClient.execute(httpGet)) {
            if(response.getStatusLine().getStatusCode()==200){
                HttpEntity entity = response.getEntity();
                String strPrice = new ObjectMapper().readValue(EntityUtils.toString(entity).toLowerCase(), String.class);
                if(strPrice.equals("false")){
                    throw new ServerRequestExeption(messageError);
                }else{
                    quotesLive = quotesLive.builder()
                            .base(base)
                            .name(name)
                            .price(new BigDecimal(strPrice))
                            .localDateTime(LocalDateTime.now())
                            .build();
                    mapResp.put(currency,quotesLive);
                }
            }else{
                throw new ServerRequestExeption(messageError);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServerRequestExeption serverRequestExeption) {
            mapResp.put("error",messageError);
            serverRequestExeption.printStackTrace();
        }
        return mapResp;
    }

    public Map<String,Object> getRequest(){
        for(Currency currency: currencySet){
            getLastForCurrentCurrency(
                    currency.toString(),
                    currency.toString().substring(0,3),
                    currency.toString().substring(3));
        }
        return mapResp;
    }
}
