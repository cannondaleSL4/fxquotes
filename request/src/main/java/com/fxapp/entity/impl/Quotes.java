package com.fxapp.entity.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fxapp.entity.FinancialEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dima on 28.11.17.
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="QUOTES")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Quotes extends FinancialEntity {
    @Id
    private Integer id;

//    @Column(name="name", nullable = false)
//    private String name;
//
//    @Column(name="period", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private Period period;
//
//    @Column(name = "date")
//    @JsonFormat
//        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
//    @Convert(converter = LocalDateTimeConverter.class)
//    private LocalDateTime date;
//
//    @Column(name="open", nullable = false)
//    private BigDecimal open;
//
//    @Column(name="close", nullable = false)
//    private BigDecimal close;
//
//    @Column(name="hight", nullable = false)
//    private BigDecimal hight;
//
//    @Column(name="low", nullable = false)
//    private BigDecimal low;

}
