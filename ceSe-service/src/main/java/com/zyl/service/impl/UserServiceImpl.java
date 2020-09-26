package com.zyl.service.impl;

import com.zyl.dao.UserDao;
import com.zyl.service.UserService;
import com.zyl.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<UserInfo> queryalluser() {
        return userDao.queryalluser();
    }
}
