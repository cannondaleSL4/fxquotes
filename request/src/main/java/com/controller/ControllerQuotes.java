package com.controller;

import com.interfaces.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dima on 07.05.18.
 */
@RestController
public class ControllerQuotes {
    @Autowired
    @Qualifier("LiveQuotesOldVersion")
    private RequestData liveQuotesFinam;
}
