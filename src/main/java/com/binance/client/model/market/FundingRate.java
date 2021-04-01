package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FundingRate {

    private String symbol;
    private BigDecimal fundingRate;
    private Long fundingTime;


}
