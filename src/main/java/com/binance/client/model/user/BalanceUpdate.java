package com.binance.client.model.user;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class BalanceUpdate {

    private String asset;
    private BigDecimal walletBalance;
    private BigDecimal crossWalletBalance;

}
