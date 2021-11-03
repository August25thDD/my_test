package com.yang.spring;

import com.yang.spring.dao.UserDao;
import com.yang.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring01
 * @description:
 * @author: Mr.Yang
 * @create: 2021-11-03 19:48
 **/

public class App {
    public static void main(String[] args) {
        String location = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userService.save();
        userDao.save();

    }
}
