package com.execute.livequotes;

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
import util.RoundOfNumber;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class RequestLiveQuotesOldVersion extends RequestData<QuotesLive> {
    @Value("${currency.oldlivequotes}")
    protected String MAIN;

    @Override
    public Map<String,Object> getRequest(Set<CriteriaBuilder>criteriaBuilders){
        localResp.clear();
        mapResp.clear();
        for(Currency currency: listOfCurrency){
            getLastForCurrentCurrency(
                    currency.toString(),
                    currency.toString().substring(0,3),
                    currency.toString().substring(3));
        }
        return mapResp;
    }

    private Map<String,Object> getLastForCurrentCurrency(String currency, String base, String quote){
        httpGet = new HttpGet(String.format(MAIN,base,quote));
        QuotesLive quotesLive = null;
        try(CloseableHttpResponse response =  httpClient.execute(httpGet)) {
            if(response.getStatusLine().getStatusCode()==200){
                HttpEntity entity = response.getEntity();
                String strPrice = new ObjectMapper().readValue(EntityUtils.toString(entity).toLowerCase(), String.class);
                if(strPrice.equals("false")){
                    throw new ServerRequestExeption(messageError);
                }else{
                    quotesLive = quotesLive.builder()
                            .currency(currency)
                            .price(RoundOfNumber.round(strPrice))
                            .localDateTime(LocalDateTime.now())
                            .build();
                    super.localResp.add(quotesLive);
                }
            }else{
                throw new ServerRequestExeption(messageError);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServerRequestExeption serverRequestExeption) {
            serverRequestExeption.printStackTrace();
            mapResp.put("error",messageError);
            return mapResp;
        }
        mapResp.put("successful",localResp);
        return mapResp;
    }
}
