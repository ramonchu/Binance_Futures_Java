package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Position {

    private Boolean isolated;
    private BigDecimal leverage;
    private BigDecimal initialMargin;
    private BigDecimal maintMargin;
    private BigDecimal openOrderInitialMargin;
    private BigDecimal positionInitialMargin;
    private String symbol;
    private BigDecimal unrealizedProfit;
    private BigDecimal entryPrice;
    private String maxNotional;
    private String positionSide;
    private BigDecimal positionAmt;

}
