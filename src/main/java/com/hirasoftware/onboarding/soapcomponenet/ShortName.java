package com.hirasoftware.onboarding.soapcomponenet;

public class ShortName {
    public String shortName;
    public String g;

    public ShortName(String g,String shortName) {
        this.shortName = shortName;
        this.g=g;
    }

    public String getShortName(){
        String body=String.format("<cus1:gSHORTNAME g=\"%s\">" +
                "<cus1:ShortName>%s</cus1:ShortName>" +
                "</cus1:gSHORTNAME>",this.g,this.shortName);
        return body;
    }
}
