package com.edu.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;
import java.util.Map;


//@Data
//@NoArgsConstructor
//@Component
@ConstructorBinding
@ConfigurationProperties(prefix = "db")
public record DataBaseProperties(String username,
                                 String password,
                                 String driver,
                                 String url,
                                 String hosts,
                                 PoolProperties pool,
                                 List<PoolProperties> pools,
                                 Map<String, Object> properties) {

    //    @Data
    //    @NoArgsConstructor
    public static record PoolProperties(
            Integer size,
            Integer timeout) {
    }
}
