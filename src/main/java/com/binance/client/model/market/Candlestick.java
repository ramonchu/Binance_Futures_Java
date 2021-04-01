package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Candlestick {

    private Long openTime;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
    private BigDecimal volume;
    private Long closeTime;
    private BigDecimal quoteAssetVolume;
    private Integer numTrades;
    private BigDecimal takerBuyBaseAssetVolume;
    private BigDecimal takerBuyQuoteAssetVolume;
    private BigDecimal ignore;

}
