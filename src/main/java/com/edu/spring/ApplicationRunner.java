package com.edu.spring;

import com.edu.spring.config.ApplicationConfiguration;
import com.edu.spring.database.pool.ConnectionPool;
import com.edu.spring.database.repository.CompanyRepository;
import com.edu.spring.database.repository.CrudRepository;
import com.edu.spring.service.CompanyService;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;
import java.lang.annotation.Annotation;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
