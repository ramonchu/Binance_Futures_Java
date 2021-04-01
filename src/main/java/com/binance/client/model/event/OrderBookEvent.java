package com.binance.client.model.event;

import com.binance.client.model.market.OrderBookEntry;
import lombok.Data;

import java.util.List;

@Data
public class OrderBookEvent {

    private String eventType;
    private Long eventTime;
    private Long transactionTime;
    private String symbol;
    private Long firstUpdateId;
    private Long lastUpdateId;
    private Long lastUpdateIdInlastStream;
    private List<OrderBookEntry> bids;
    private List<OrderBookEntry> asks;

}
