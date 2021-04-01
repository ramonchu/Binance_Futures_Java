package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LiquidationOrder {

    private String symbol;
    private BigDecimal price;
    private BigDecimal origQty;
    private BigDecimal executedQty;
    private BigDecimal averagePrice;
    private String timeInForce;
    private String type;
    private String side;
    private Long time;

}
