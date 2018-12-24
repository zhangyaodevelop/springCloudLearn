package com.order.service.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.cloud.learn.util.UUIDUtils;
import com.order.service.dao.OrderEntryInfoMapper;
import com.order.service.dao.OrderInfoMapper;
import com.order.service.model.OrderInfo;
import com.order.service.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Resource
    private OrderEntryInfoMapper orderEntryInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addOrderInfoAndOrderEntry(OrderInfo orderInfo) {
        try {
            if(null!=orderInfo){
                orderInfo.setOrderUuid(UUIDUtils.getUUID());
                int i=orderInfoMapper.insertSelective(orderInfo);
                if(!CollectionUtils.isEmpty(orderInfo.getOrderEntryInfos())){
                    orderInfo.getOrderEntryInfos().forEach(e->{
                        e.setOrderUuid(orderInfo.getOrderUuid());
                        e.setOrderEntryUuid(UUIDUtils.getUUID());
                        orderEntryInfoMapper.insertSelective(e);
                    });
                }
                return i;
            }
            return 0;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public String getOrderByOrderUuid(String orderUuid) {
        OrderInfo orderInfo= orderInfoMapper.selectByPrimaryKey(orderUuid);
        return JSONObject.toJSONString(orderInfo);
    }
}
