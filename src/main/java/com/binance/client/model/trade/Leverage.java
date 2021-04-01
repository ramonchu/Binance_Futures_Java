package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Leverage {

    private BigDecimal leverage;
    private Double maxNotionalValue;
    private String symbol;

}
