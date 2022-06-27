package org.brightly.services;

import io.smallrye.common.constraint.NotNull;
import org.brightly.dtos.CompanyDto;
import org.brightly.entities.Company;
import org.brightly.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    @Inject
    CompanyRepository companyRepository;

    @Override
    public Long createCompany(CompanyDto companyDto) {
        Company company = new Company();
        company.setCode(companyDto.getCompanyCode());
        company.setName(companyDto.getCompanyName());
        company.setDescription(companyDto.getCompanyDescription());

        company = companyRepository.save(company);
        return company.getId();
    }

    @Override
    public CompanyDto findCompany(Long id) {
        Company company = companyRepository.getCompanyById(id);
        CompanyDto companyDto = null;
        if(company != null) {
            companyDto = getCompanyDto(company);
        }
        return companyDto;
    }

    private CompanyDto getCompanyDto(Company company) {
        CompanyDto companyDto = new CompanyDto();
        companyDto.setCompanyId(company.getId());
        companyDto.setCompanyCode(company.getCode());
        companyDto.setCompanyName(company.getName());
        companyDto.setCompanyDescription(company.getDescription());
        return companyDto;
    }

    @Override
    public List<CompanyDto> findAll() {
        List<Company> companyList=companyRepository.findAll();
        return getCompanyDtos(companyList);
    }

    @NotNull
    private List<CompanyDto> getCompanyDtos(List<Company> companyList) {
        List<CompanyDto> companyDtoList = new ArrayList<>();
        if(companyList != null && !companyList.isEmpty()) {
            companyDtoList = companyList
                    .stream()
                    .map(company -> getCompanyDto(company))
                    .collect(Collectors.toList());
        }
        return companyDtoList;
    }
}
