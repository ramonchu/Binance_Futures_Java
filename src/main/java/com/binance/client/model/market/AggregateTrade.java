package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AggregateTrade {

    private Long id;
    private BigDecimal price;
    private BigDecimal qty;
    private Long firstId;
    private Long lastId;
    private Long time;
    private Boolean isBuyerMaker;

}
