package com.binance.client.model.user;

import lombok.Data;

import java.util.List;

@Data
public class AccountUpdate {

    private List<BalanceUpdate> balances;
    private List<PositionUpdate> positions;

}
