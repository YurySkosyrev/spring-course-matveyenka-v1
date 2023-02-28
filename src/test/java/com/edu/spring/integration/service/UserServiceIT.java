package com.edu.spring.integration.service;

import com.edu.spring.database.pool.ConnectionPool;
import com.edu.spring.integration.annotation.IT;
import com.edu.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;


@IT
@RequiredArgsConstructor
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UserServiceIT {

    private final UserService userService;
    private final ConnectionPool pool1;


    @Test
    void test1() {
        System.out.println();
    }

    @Test
    void test2() {
        System.out.println();
    }

    @Test
    void test3() {
        System.out.println();
    }

}
