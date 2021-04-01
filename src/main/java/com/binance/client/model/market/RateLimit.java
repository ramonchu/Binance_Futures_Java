package com.binance.client.model.market;

import lombok.Data;

@Data
public class RateLimit {

    private String rateLimitType;
    private String interval;
    private Long intervalNum;
    private Long limit;

}
