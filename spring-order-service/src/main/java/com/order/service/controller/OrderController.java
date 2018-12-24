package com.order.service.controller;


import com.cloud.learn.code.SysMsgCode;
import com.cloud.learn.model.ResponseData;
import com.order.service.model.OrderInfo;
import com.order.service.service.IOrderService;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Title
 * @Description 用户模块
 * @Author yao.zhang04@hand-china.com
 * @date: 2018/12/20
 */
@RestController
@RequestMapping(value = "/order")
@EnableFeignClients
public class OrderController {

    @Resource
    private IOrderService iOrderService;

    @RequestMapping(value = "/getOrderInfo", method = RequestMethod.GET)
    public String getOrderInfo(@RequestParam String orderUuid) {
        return iOrderService.getOrderByOrderUuid(orderUuid);
    }


    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public ResponseData addOrder(@RequestBody OrderInfo orderInfo) {
        int i=iOrderService.addOrderInfoAndOrderEntry(orderInfo);
        if(i>0){
            return new ResponseData(SysMsgCode.SYS_SUCCESS,SysMsgCode.SYS_SUCCESS_VALUE,true);
        }else{
            return new ResponseData(SysMsgCode.SYS_FAILED,SysMsgCode.SYS_FAILED_VALUE,false);
        }
    }

}
