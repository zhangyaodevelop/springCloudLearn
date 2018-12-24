package com.cloud.learn.controller;


import com.cloud.learn.code.SysMsgCode;
import com.cloud.learn.feign.IOrderFeign;
import com.cloud.learn.model.ResponseData;
import com.cloud.learn.model.UserInfo;
import com.cloud.learn.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title
 * @Description 用户模块
 * @Author yao.zhang04@hand-china.com
 * @date: 2018/12/20
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private IOrderFeign iOrderFeign;

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/getOrderInfo", method = RequestMethod.POST)
    public ResponseData register(@RequestParam  String orderUuid) {
        System.out.println("参数："+orderUuid);
        List<String> stringList=new ArrayList<>();
        stringList.add(iOrderFeign.getOrderInfo(orderUuid));
        return new ResponseData(SysMsgCode.SYS_SUCCESS,SysMsgCode.SYS_SUCCESS_VALUE,stringList,true);
    }



    @RequestMapping(value = "/addUserInfo", method = RequestMethod.POST)
    public ResponseData addUserInfo(@RequestBody UserInfo userInfo) {
        int i=iUserService.addUser(userInfo);
        if(i>0){
            return new ResponseData(SysMsgCode.SYS_SUCCESS,SysMsgCode.SYS_SUCCESS_VALUE,true);
        }else{
            return new ResponseData(SysMsgCode.SYS_FAILED,SysMsgCode.SYS_FAILED_VALUE,false);
        }

    }

}
