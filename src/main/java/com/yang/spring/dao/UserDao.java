package com.yang.spring.dao;

/**
 * @program: spring01
 * @description:
 * @author: Mr.Yang
 * @create: 2021-11-03 18:46
 **/

public class UserDao {
    public void save() {
        System.out.println("User save is running ");
        try {
            int i = 1 / 0;
        } catch (Exception e) {
        }
        int j = 1 / 0;
        System.out.println("其他同事接着写代码1");
        System.out.println("其他同事接着写代码2");
    }
}
