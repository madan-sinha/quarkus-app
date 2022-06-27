package org.brightly.dtos;

public class CompanyDto {

    private Long companyId;
    private String companyName;
    private String companyDescription;

    private String companyCode;

    public CompanyDto() {}

    public CompanyDto(Long companyId, String companyCode, String companyName,  String companyDescription ) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyDescription = companyDescription;
        this.companyCode = companyCode;
    }

    public CompanyDto(String companyCode, String companyName,  String companyDescription ) {
        this.companyName = companyName;
        this.companyDescription = companyDescription;
        this.companyCode = companyCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyDescription='" + companyDescription + '\'' +
                ", companyCode='" + companyCode + '\'' +
                '}';
    }
}
