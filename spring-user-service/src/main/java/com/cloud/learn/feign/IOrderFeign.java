package com.cloud.learn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title
 * @Description
 * @Author Yao.Zhang04@hand-china.com
 * @date: 2018/10/17 14:04
 */
@FeignClient(name = "spring-order-service")
public interface IOrderFeign {

    /**
     * 用户基础信息查询
     * @param orderUuid
     * @return
     */
    @RequestMapping(value = "/order/getOrderInfo", method = RequestMethod.GET)
    String getOrderInfo(@RequestParam(value = "orderUuid") String orderUuid);
}
