package com.dim.fxapp.entity.impl;

import com.dim.fxapp.entity.FinancialEntity;
import com.dim.fxapp.entity.converter.LocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Convert;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by dima on 28.11.17.
 */

@Getter
@Builder
public class QuotesLive extends FinancialEntity {

    private String currency;

    private BigDecimal price;

    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime localDateTime;
}
