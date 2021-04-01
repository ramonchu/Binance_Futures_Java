package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SymbolTickerEvent {

    private String eventType;
    private Long eventTime;
    private String symbol;
    private BigDecimal priceChange;
    private BigDecimal priceChangePercent;
    private BigDecimal weightedAvgPrice;
    private BigDecimal lastPrice;
    private BigDecimal lastQty;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal totalTradedBaseAssetVolume;
    private BigDecimal totalTradedQuoteAssetVolume;
    private Long openTime;
    private Long closeTime;
    private Long firstId;
    private Long lastId;
    private Long count;

}
