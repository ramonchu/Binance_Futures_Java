package com.binance.client.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : wangwanlu
 * @since : 2020/3/25, Wed
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {

    private int code;

    private String msg;

}
