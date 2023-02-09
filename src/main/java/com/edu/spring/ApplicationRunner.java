package com.edu.spring;

import com.edu.spring.config.ApplicationConfiguration;
import com.edu.spring.database.pool.ConnectionPool;
import com.edu.spring.database.repository.CompanyRepository;
import com.edu.spring.database.repository.CrudRepository;
import com.edu.spring.service.CompanyService;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class ApplicationRunner {
    public static void main(String[] args) {

        String value = "hello";
        System.out.println(CharSequence.class.isAssignableFrom(value.getClass()));
        System.out.println(BeanFactoryPostProcessor.class.isAssignableFrom(value.getClass()));
        System.out.println(Serializable.class.isAssignableFrom(value.getClass()));

        try (var context = new AnnotationConfigApplicationContext()) {

            context.register(ApplicationConfiguration.class);
            context.getEnvironment().setActiveProfiles("prod");
            context.refresh();

            var connectionPool = context.getBean("pool1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyService = context.getBean(CompanyService.class);
            System.out.println(companyService.findById(1));
        }
    }
}
