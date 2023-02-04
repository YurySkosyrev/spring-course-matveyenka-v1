package com.spring;

import com.spring.database.pool.ConnectionPool;
import com.spring.database.repository.UserRepository;
import com.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var connectionPool = new ConnectionPool();
        var userRepository = new UserRepository(connectionPool);
        var userService = new UserService(userRepository);
        // TODO: 04.02.2023 UserService
    }
}
