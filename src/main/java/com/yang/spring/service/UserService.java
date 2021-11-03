package com.yang.spring.service;

import com.yang.spring.dao.UserDao;

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
