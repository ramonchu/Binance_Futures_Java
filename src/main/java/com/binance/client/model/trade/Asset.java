package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Asset {

    private String asset;
    private BigDecimal initialMargin;
    private BigDecimal maintMargin;
    private BigDecimal marginBalance;
    private BigDecimal maxWithdrawAmount;
    private BigDecimal openOrderInitialMargin;
    private BigDecimal positionInitialMargin;
    private BigDecimal unrealizedProfit;

}
