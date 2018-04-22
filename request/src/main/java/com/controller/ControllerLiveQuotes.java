package com.controller;

import com.interfaces.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by dima on 24.03.18.
 */
@RestController
public class ControllerLiveQuotes {

    @Autowired
    @Qualifier("LiveQuotes")
    private RequestData liveQuotes;

    @RequestMapping(value="/lq", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getLastLiveQuotes(){
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(180, TimeUnit.SECONDS))
                .body(liveQuotes.getRequest());
    }

}
