package com.dim.fxapp.entity;

import com.dim.fxapp.entity.impl.Quotes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * Created by dima on 28.11.17.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type",
                defaultImpl=Quotes.class)
public interface FinancialEntity extends Serializable {

}
