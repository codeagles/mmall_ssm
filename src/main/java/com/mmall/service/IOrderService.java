package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by codeagles on 2017/8/2.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
    ServerResponse aliCallback(Map<String,String> params);
    ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);

}
