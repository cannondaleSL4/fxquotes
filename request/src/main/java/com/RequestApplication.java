package com;

import com.execute.livequotes.RequestLiveQuotesFinam;
import com.execute.livequotes.RequestLiveQuotesOldVersion;
import com.interfaces.RequestData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by dima on 21.01.18.
 */
@SpringBootApplication
public class RequestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RequestApplication.class, args) ;
    }

    @Bean("LiveQuotesOldVersion")
    public RequestData getLiveQuotesOldVersion(){
        return new RequestLiveQuotesOldVersion();
    }

    @Bean("LiveQuotesFinam")
    public RequestData getLiveQuotesFinam(){
        return new RequestLiveQuotesFinam();
    }
}
