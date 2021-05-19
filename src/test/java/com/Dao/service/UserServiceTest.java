package com.Dao.service;

import com.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Object userService = context.getBean("userService");
        UserService userService1 = (UserService) userService;

    }

}