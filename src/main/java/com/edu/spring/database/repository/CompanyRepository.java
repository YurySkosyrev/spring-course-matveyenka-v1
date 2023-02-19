package com.edu.spring.database.repository;

import com.edu.spring.bpp.Auditing;
import com.edu.spring.bpp.Transaction;
import com.edu.spring.database.entity.Company;
import com.edu.spring.database.pool.ConnectionPool;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Slf4j
@Auditing
@Transaction
@Repository
@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository<Integer, Company>{


    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private final Integer poolSize;

    @PostConstruct
    private void init() {
        log.info("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        log.info("FindById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }

}
