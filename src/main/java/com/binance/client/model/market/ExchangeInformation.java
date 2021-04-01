package com.binance.client.model.market;

import lombok.Data;

import java.util.List;

@Data
public class ExchangeInformation {

    private String timezone;
    private Long serverTime;
    private List<RateLimit> rateLimits;
    private List<ExchangeFilter> exchangeFilters;
    private List<ExchangeInfoEntry> symbols;

}
