package com.cloud.learn.dao;

import com.cloud.learn.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String userUuid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userUuid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}