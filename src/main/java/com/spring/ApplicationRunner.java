package com.spring;

import com.spring.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");

        //System.out.println(context.getBean(ConnectionPool.class));

        var connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);
    }
}
