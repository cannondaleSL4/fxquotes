package com.dim.fxapp.entity.enums;

/**
 * Created by dima on 02.12.17.
 */
public enum Currency {
    GBPAUD ("GBPAUD",181412),
    GBPJPY ("GBPJPY",181386),
    GBPNZD ("GBPCAD",181388),

    EURJPY ("EURJPY",84),
    EURAUD ("EURAUD",181414),
    EURGBP ("EURGBP",88),

    EURUSD ("EURUSD",83),
    GBPUSD ("GBPUSD",86),
    USDJPY ("USDJPY",87),
    AUDUSD ("AUDUSD",66699),
    NZDUSD ("NZDUSD",181425),
    USDCAD ("USDCAD",66700);

    private final String currency;
    private final Integer em;

    private Currency (final String currency, final Integer em){
        this.currency = currency;
        this.em=em;
    }

    public static Integer getByCurrensy(String name) {
        for(Currency e : values()) {
            if(e.currency.equals(name)) return e.em;
        }
        return 0;
    }

    @Override
    public String toString(){
        return currency;
    }
}
