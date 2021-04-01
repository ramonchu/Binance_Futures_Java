package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CandlestickEvent {

    private String eventType;
    private Long eventTime;
    private String symbol;
    private Long startTime;
    private Long closeTime;
    private String interval;
    private Long firstTradeId;
    private Long lastTradeId;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal volume;
    private Long numTrades;
    private Boolean isClosed;
    private BigDecimal quoteAssetVolume;
    private BigDecimal takerBuyBaseAssetVolume;
    private BigDecimal takerBuyQuoteAssetVolume;
    private Long ignore;


}
