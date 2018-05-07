package com.dim.fxapp.entity.criteria;

import com.dim.fxapp.entity.enums.Currency;
import com.dim.fxapp.entity.enums.Period;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by dima on 07.05.18.
 */
@Builder
@Data
public class CriteriaBuilder<D extends LocalDateTime, C extends Currency, P extends Period> {
    private C currency;
    private P period;
    private D from;
    private D to;
}
