package com.dim.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

/**
 * Created by dima on 19.11.17.
 */
@Component
public class ErrorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("Using Route PreFilter");

        return null;
    }
}
