package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private String clientOrderId;
    private BigDecimal cumQuote;
    private BigDecimal executedQty;
    private Long orderId;
    private BigDecimal origQty;
    private BigDecimal price;
    private Boolean reduceOnly;
    private String side;
    private String positionSide;
    private String status;
    private BigDecimal stopPrice;
    private String symbol;
    private String timeInForce;
    private String type;
    private Long updateTime;
    private String workingType;

}
