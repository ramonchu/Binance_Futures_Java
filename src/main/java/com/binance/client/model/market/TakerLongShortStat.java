package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TakerLongShortStat {
    
    private BigDecimal buySellRatio;
    private BigDecimal sellVol;
    private BigDecimal buyVol;
    private Long timestamp;

}
