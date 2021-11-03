package com.yang.ioc;

import com.yang.ioc.service.UserService;

/**
 * @program: spring01
 * @description:
 * @author: Mr.Yang
 * @create: 2021-11-03 19:48
 **/

public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.save();
    }
}
