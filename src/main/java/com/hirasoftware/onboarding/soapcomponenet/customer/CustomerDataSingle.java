package com.hirasoftware.onboarding.soapcomponenet.customer;

public class CustomerDataSingle {

    private String sector;
    private String accountOfficer;
    private String industry;
    private String target;
    private String nationality;
    private String residence;
    private String language;
    private String title;
    private String givenName;
    private String gender;
    private String maritalStatus;

    public CustomerDataSingle(String sector,
                              String accountOfficer,
                              String industry,
                              String target,
                              String nationality,
                              String residence,
                              String language,
                              String title,
                              String givenName,
                              String gender,
                              String maritalStatus) {
        this.sector = sector;
        this.accountOfficer = accountOfficer;
        this.industry = industry;
        this.target = target;
        this.nationality = nationality;
        this.residence = residence;
        this.language = language;
        this.title = title;
        this.givenName = givenName;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getCustomerInputType(){
        String body=String.format(
                "\t<cus1:Sector>%s</cus1:Sector>\n" +
                "\t<cus1:AccountOfficer>%s</cus1:AccountOfficer>\n" +
                "\t<cus1:Industry>%s</cus1:Industry>\n" +
                "\t<cus1:Target>%s</cus1:Target>\n" +
                "\t<cus1:Nationality>%s</cus1:Nationality>\n" +
                "\t<cus1:Residence>%s</cus1:Residence>\n" +
                "\t<cus1:Language>%s</cus1:Language>\n" +
                "\t<cus1:TITLE>%s</cus1:TITLE>\n" +
                "\t<cus1:GIVENNAMES>%s</cus1:GIVENNAMES>\n" +
                "\t<cus1:Gender>%s</cus1:Gender>\n" +
                "\t<cus1:MaritalStatus>%s</cus1:MaritalStatus>\n" +
                "\t<cus1:CustomerType></cus1:CustomerType>\n",
                this.sector,
                this.accountOfficer,
                this.industry,
                this.target,
                this.nationality,
                this.residence,
                this.language,
                this.title,
                this.givenName,
                this.gender,
                this.maritalStatus);
        return body;
    }
}
