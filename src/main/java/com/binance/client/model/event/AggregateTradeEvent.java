package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AggregateTradeEvent {

    private String eventType;
    private Long eventTime;
    private String symbol;
    private Long id;
    private BigDecimal price;
    private BigDecimal qty;
    private Long firstId;
    private Long lastId;
    private Long time;
    private Boolean isBuyerMaker;

}
