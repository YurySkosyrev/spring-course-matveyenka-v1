package com.edu.spring.database.repository;

import com.edu.spring.bpp.InjectBean;
import com.edu.spring.database.pool.ConnectionPool;

public class CompanyRepository {
    @InjectBean
    private ConnectionPool connectionPool;

}
