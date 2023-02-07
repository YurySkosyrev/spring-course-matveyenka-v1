package com.edu.spring.database.repository;

import com.edu.spring.bpp.Auditing;
import com.edu.spring.bpp.InjectBean;
import com.edu.spring.bpp.Transaction;
import com.edu.spring.database.entity.Company;
import com.edu.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Auditing
@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company>{
    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("FindById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
