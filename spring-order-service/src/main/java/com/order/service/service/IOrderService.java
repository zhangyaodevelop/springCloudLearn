package com.order.service.service;

import com.order.service.model.OrderInfo;

public interface IOrderService {


    int addOrderInfoAndOrderEntry(OrderInfo orderInfo);

    String getOrderByOrderUuid(String orderUuid);
}
