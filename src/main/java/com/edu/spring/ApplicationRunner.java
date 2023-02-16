package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {

//        String value = "hello";
//        System.out.println(CharSequence.class.isAssignableFrom(value.getClass()));
//        System.out.println(BeanFactoryPostProcessor.class.isAssignableFrom(value.getClass()));
//        System.out.println(Serializable.class.isAssignableFrom(value.getClass()));
//
//        try (var context = new AnnotationConfigApplicationContext()) {
//
//            context.register(ApplicationConfiguration.class);
//            context.getEnvironment().setActiveProfiles("prod");
//            context.refresh();
//
//            var connectionPool = context.getBean("pool1", ConnectionPool.class);
//            System.out.println(connectionPool);
//
//            var companyService = context.getBean(CompanyService.class);
//            System.out.println(companyService.findById(1));
//        }
        var context = SpringApplication.run(ApplicationRunner.class, args);
        System.out.println(context.getBeanDefinitionCount());
    }
}
