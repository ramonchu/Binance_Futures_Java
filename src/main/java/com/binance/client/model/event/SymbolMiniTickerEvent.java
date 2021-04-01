package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SymbolMiniTickerEvent {

    private String eventType;
    private Long eventTime;
    private String symbol;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal totalTradedBaseAssetVolume;
    private BigDecimal totalTradedQuoteAssetVolume;

}
