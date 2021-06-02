package com;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class UserService {
    @Autowired
    private UserDaoImpl userDao;


    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);

        userDao.addUser(new User(user.getName() + "as", user.getId() + 1, user.getPrice() + 123));
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser(new User("wqs",12,1212));
        userService.addUser(new User("wqs1",11,12112));

    }
}
