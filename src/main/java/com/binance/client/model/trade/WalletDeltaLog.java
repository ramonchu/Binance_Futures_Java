package com.binance.client.model.trade;

import lombok.Data;

@Data
public class WalletDeltaLog {

    private String symbol;
    private int type;
    private String amount;
    private String asset;
    private Long time;
    private String positionSide;

}