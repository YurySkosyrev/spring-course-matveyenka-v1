package com.edu.spring.config;

import com.edu.spring.database.pool.ConnectionPool;
import com.edu.spring.database.repository.UserRepository;
import com.edu.web.config.WebConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Import(WebConfiguration.class)
@Configuration

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
