package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by codeagles on 2017/8/2.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);

}
