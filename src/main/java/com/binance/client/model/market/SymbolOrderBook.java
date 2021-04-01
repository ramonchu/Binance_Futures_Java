package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SymbolOrderBook {

    private String symbol;
    private BigDecimal bidPrice;
    private BigDecimal bidQty;
    private BigDecimal askPrice;
    private BigDecimal askQty;

}
