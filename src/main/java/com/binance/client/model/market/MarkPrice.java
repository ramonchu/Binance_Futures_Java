package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MarkPrice {

    private String symbol;
    private BigDecimal markPrice;
    private BigDecimal lastFundingRate;
    private Long nextFundingTime;
    private Long time;

}
