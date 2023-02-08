package com.edu.spring.config;

import com.edu.spring.database.pool.ConnectionPool;
import com.edu.spring.database.repository.CrudRepository;
import com.edu.spring.database.repository.UserRepository;
import com.edu.web.config.WebConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Component;

@Import(WebConfiguration.class)
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.edu.spring",
        useDefaultFilters = false,
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, value = Component.class),
                @Filter(type = FilterType.ASSIGNABLE_TYPE, value = CrudRepository.class),
                @Filter(type = FilterType.REGEX, pattern = "com\\..+Repository")
        }
)
public class ApplicationConfiguration {

        @Bean
        public ConnectionPool pool2(@Value("${db.username}") String username) {
                return new ConnectionPool(username, 28);
        }

        @Bean
        public ConnectionPool pool3() {
                return new ConnectionPool("test-pool", 25);
        }

        @Bean
        @Profile("!prod")
        public UserRepository userRepository2(ConnectionPool pool2){
                return new UserRepository(pool2);
        }

        @Bean
        public UserRepository userRepository3(){
                return new UserRepository(pool3());
        }
}
