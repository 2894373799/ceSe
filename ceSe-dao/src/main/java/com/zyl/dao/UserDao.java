package com.zyl.dao;


import com.zyl.vo.UserInfo;

import java.util.List;

public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<UserInfo> queryalluser();

}
