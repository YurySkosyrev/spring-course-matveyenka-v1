package com.edu.spring.service;

import com.edu.spring.database.repository.UserRepository;
import com.edu.spring.database.repository.CompanyRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
