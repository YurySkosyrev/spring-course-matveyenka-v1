package com.edu.spring;

import com.edu.spring.database.pool.ConnectionPool;
import com.edu.spring.database.repository.CompanyRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {

            //System.out.println(context.getBean(ConnectionPool.class));

            var connectionPool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
        }
    }
}
