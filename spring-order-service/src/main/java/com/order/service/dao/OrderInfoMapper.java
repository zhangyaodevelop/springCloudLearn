package com.order.service.dao;


import com.order.service.model.OrderInfo;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String orderUuid);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(String orderUuid);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}