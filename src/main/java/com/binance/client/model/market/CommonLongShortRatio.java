package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CommonLongShortRatio {
    
    private String symbol;
    private BigDecimal longAccount;
    private BigDecimal longShortRatio;
    private BigDecimal shortAccount;
    private Long timestamp;

}
