package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderBookEntry {

    private BigDecimal price;
    private BigDecimal qty;

}
