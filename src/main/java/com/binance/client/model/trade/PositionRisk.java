package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PositionRisk {

    private BigDecimal entryPrice;
    private BigDecimal leverage;
    private Double maxNotionalValue;
    private BigDecimal liquidationPrice;
    private BigDecimal markPrice;
    private BigDecimal positionAmt;
    private String symbol;
    private String isolatedMargin;
    private String positionSide;
    private String marginType;
    private BigDecimal unrealizedProfit;

}
