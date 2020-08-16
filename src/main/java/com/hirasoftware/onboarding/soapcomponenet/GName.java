package com.hirasoftware.onboarding.soapcomponenet;

public class GName {
    public String firstName;
    public String middleName;
    public String lastName;
    public String g;

    public GName(String g,String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.g=g;
    }
    public String getFullName(){
        String body=String.format("" +
                "<cus1:gNAME1 g=\"%s\">\n" +
                "<cus1:FullName>%s %s %s</cus1:FullName>\n" +
                "</cus1:gNAME1>\n",
                this.g,
                this.firstName,
                this.middleName,
                this.lastName);
        return body;
    }
}
