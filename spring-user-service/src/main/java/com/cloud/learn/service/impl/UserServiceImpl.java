package com.cloud.learn.service.impl;

import com.cloud.learn.dao.UserInfoMapper;
import com.cloud.learn.service.IUserService;
import com.cloud.learn.util.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService{

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int addUser(UserInfo userInfo) {
        if(null!=userInfo){
            userInfo.setUserUuid(UUIDUtils.getUUID());
           return userInfoMapper.insert(userInfo);
        }
        return 0;
    }
}
