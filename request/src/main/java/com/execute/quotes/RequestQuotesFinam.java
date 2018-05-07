package com.execute.quotes;

import com.dim.fxapp.entity.impl.QuotesLive;
import com.interfaces.RequestData;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Map;
import java.util.Set;

/**
 * Created by dima on 07.05.18.
 */
public class RequestQuotesFinam extends RequestData<QuotesLive> {

    @Override
    public Map<String, Object> getRequest(Set<CriteriaBuilder> criteriaBuilders) {
        return null;
    }
}
