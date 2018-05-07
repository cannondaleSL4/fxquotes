package com.controller;

import com.dim.fxapp.entity.criteria.CriteriaBuilder;
import com.dim.fxapp.entity.enums.Currency;
import com.interfaces.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by dima on 24.03.18.
 */
@RestController
public class ControllerLiveQuotes {

    @Autowired
    @Qualifier("LiveQuotesOldVersion")
    private RequestData liveQuotesFinam;

    private List<Currency> listOfCurrency = new ArrayList<>(Arrays.asList(Currency.values()));
    private Set<CriteriaBuilder>criteriaBuilders = new HashSet<>();

    @RequestMapping(value="/lq", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getLastLiveQuotes(){
        Set<CriteriaBuilder> criteriaBuilders = new HashSet<>();

        listOfCurrency.forEach(currency ->{
            CriteriaBuilder criteriaBuilder = CriteriaBuilder.builder()
                    .currency(currency)
                    .build();
            criteriaBuilders.add(criteriaBuilder);
        });

        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(600, TimeUnit.SECONDS))
                .body(liveQuotesFinam.getRequest(criteriaBuilders));
    }
}
