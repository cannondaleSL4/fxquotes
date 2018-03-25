package com;

import com.execute.RequestLiveQuotes;
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

    @Bean("LiveQuotes")
    public RequestData getLiveQuotes(){
        return new RequestLiveQuotes();
    }
}
