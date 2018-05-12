package com.dim.fxapp.entity.impl;

import com.dim.fxapp.entity.FinancialEntity;
import com.dim.fxapp.entity.converter.LocalDateTimeConverter;
import com.dim.fxapp.entity.enums.Period;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * Created by dima on 28.11.17.
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="quotes")
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.IntSequenceGenerator.class,
//        property = "oid"
//)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
//        include = JsonTypeInfo.As.PROPERTY,
//        property = "@class")
public class Quotes implements FinancialEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @JsonIgnore
    private Integer id;

    @Column(name="currency", nullable = false)
    private String currency;

    @Column(name="period", nullable = false)
    @Enumerated(EnumType.STRING)
    private Period period;

    @Column(name = "data", nullable = false)
    @JsonFormat
        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime date;

    @Column(name="open", nullable = false)
    private BigDecimal open;

    @Column(name="close", nullable = false)
    private BigDecimal close;

    @Column(name="high", nullable = false)
    private BigDecimal high;

    @Column(name="low", nullable = false)
    private BigDecimal low;
}
