package com.edu.spring.integration.service;

import com.edu.spring.config.DataBaseProperties;
import com.edu.spring.dto.CompanyReadDTO;
import com.edu.spring.integration.annotation.IT;
import com.edu.spring.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@IT
@RequiredArgsConstructor
public class CompanyServiceIT {

    private static final Integer COMPANY_ID = 1;


    private final CompanyService companyService;

    private final DataBaseProperties dataBaseProperties;

    @Test
    void findById() {

        var actualResult = companyService.findById(COMPANY_ID);

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDTO(COMPANY_ID);
        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));

    }
}
