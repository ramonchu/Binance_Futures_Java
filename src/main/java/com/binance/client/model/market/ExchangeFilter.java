package com.binance.client.model.market;

import lombok.Data;

@Data
public class ExchangeFilter {

    private String filterType;
    private Long maxNumOrders;
    private Long maxNumAlgoOrders;

}
