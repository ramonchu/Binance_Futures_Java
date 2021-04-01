package com.binance.client.model.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SymbolBookTickerEvent {

    private Long orderBookUpdateId;
    private String symbol;
    private BigDecimal bestBidPrice;
    private BigDecimal bestBidQty;
    private BigDecimal bestAskPrice;
    private BigDecimal bestAskQty;
    private Long eventTime;
    private Long transactionTime;

}
