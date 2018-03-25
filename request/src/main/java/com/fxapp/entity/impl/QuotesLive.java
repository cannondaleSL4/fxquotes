package com.fxapp.entity.impl;

import com.fxapp.entity.FinancialEntity;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by dima on 28.11.17.
 */

@Getter
@Builder
public class QuotesLive extends FinancialEntity {
    private Integer id;

    private String name;

    private String base;

    private BigDecimal price;

    private LocalDateTime localDateTime;
}
