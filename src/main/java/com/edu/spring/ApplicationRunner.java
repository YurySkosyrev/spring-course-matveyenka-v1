package com.edu.spring;

import com.edu.spring.config.DataBaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ConfigurationPropertiesScan
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
        System.out.println(context.getBean("pool1"));
        System.out.println(context.getBean(DataBaseProperties.class));
    }
}
