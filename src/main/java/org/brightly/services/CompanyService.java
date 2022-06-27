package org.brightly.services;

import org.brightly.dtos.CompanyDto;

import java.util.List;

public interface CompanyService {

    public Long createCompany(CompanyDto companyDto);

    public CompanyDto findCompany(Long id);

    public List<CompanyDto> findAll();
}
