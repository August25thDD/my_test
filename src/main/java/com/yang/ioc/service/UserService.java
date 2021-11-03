package com.yang.ioc.service;

import com.yang.ioc.dao.UserDao;

/**
 * @program: spring01
 * @description:
 * @author: Mr.Yang
 * @create: 2021-11-03 18:47
 **/

public class UserService {
    public void save() {
        UserDao userDao = new UserDao();
        userDao.save();
    }
}
