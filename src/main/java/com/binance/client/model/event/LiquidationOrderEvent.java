package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LiquidationOrderEvent {

    private String eventType;
    private Long eventTime;
    private String symbol;
    private String side;
    private String type;
    private String timeInForce;
    private BigDecimal origQty;
    private BigDecimal price;
    private BigDecimal averagePrice;
    private String orderStatus;
    private BigDecimal lastFilledQty;
    private BigDecimal lastFilledAccumulatedQty;
    private Long time;

}
