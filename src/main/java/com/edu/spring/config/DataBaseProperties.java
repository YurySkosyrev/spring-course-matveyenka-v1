package com.edu.spring.config;

import java.util.List;

public class DataBaseProperties {
    private String username;
    private String password;
    private String driver;
    private String url;
    private String hosts;
    private PoolProperties pool;
    private List<PoolProperties> pools;

    public static class PoolProperties {
        private Integer size;
        private Integer timeout;
    }
}
