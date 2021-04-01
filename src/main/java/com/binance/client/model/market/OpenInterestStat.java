package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OpenInterestStat {
    
    private String symbol;
    private BigDecimal sumOpenInterest;
    private BigDecimal sumOpenInterestValue;
    private Long timestamp;

}
