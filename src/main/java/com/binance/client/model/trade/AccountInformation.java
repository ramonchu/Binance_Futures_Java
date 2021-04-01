package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AccountInformation {

    private Boolean canDeposit;
    private Boolean canTrade;
    private Boolean canWithdraw;
    private BigDecimal feeTier;
    private BigDecimal maxWithdrawAmount;
    private BigDecimal totalInitialMargin;
    private BigDecimal totalMaintMargin;
    private BigDecimal totalMarginBalance;
    private BigDecimal totalOpenOrderInitialMargin;
    private BigDecimal totalPositionInitialMargin;
    private BigDecimal totalUnrealizedProfit;
    private BigDecimal totalWalletBalance;
    private Long updateTime;
    private List<Asset> assets;
    private List<Position> positions;

}
