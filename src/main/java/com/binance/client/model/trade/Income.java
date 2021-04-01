package com.binance.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Income {

    private String symbol;
    private String incomeType;
    private BigDecimal income;
    private String asset;
    private Long time;

}
