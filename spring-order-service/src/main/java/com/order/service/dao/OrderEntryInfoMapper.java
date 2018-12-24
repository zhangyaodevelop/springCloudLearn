package com.order.service.dao;


import com.order.service.model.OrderEntryInfo;

public interface OrderEntryInfoMapper {
    int deleteByPrimaryKey(String orderEntryUuid);

    int insert(OrderEntryInfo record);

    int insertSelective(OrderEntryInfo record);

    OrderEntryInfo selectByPrimaryKey(String orderEntryUuid);

    int updateByPrimaryKeySelective(OrderEntryInfo record);

    int updateByPrimaryKey(OrderEntryInfo record);
}