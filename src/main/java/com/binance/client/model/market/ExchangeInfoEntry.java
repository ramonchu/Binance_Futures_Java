package com.binance.client.model.market;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
public class ExchangeInfoEntry {

    private String symbol;
    private String status;
    private BigDecimal maintMarginPercent;
    private BigDecimal requiredMarginPercent;
    private String baseAsset;
    private String quoteAsset;
    private Long pricePrecision;
    private Long quantityPrecision;
    private Long baseAssetPrecision;
    private Long quotePrecision;
    private List<String> orderTypes;
    private List<String> timeInForce;
    private List<List<Map<String, String>>> filters;

}
