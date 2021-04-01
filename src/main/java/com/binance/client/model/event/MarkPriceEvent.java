package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MarkPriceEvent {

    private String eventType;
    private Long eventTime;
    private String symbol;
    private BigDecimal markPrice;
    private BigDecimal fundingRate;
    private Long nextFundingTime;
    private BigDecimal indexPrice;
    private BigDecimal estimatedPrice;

}
