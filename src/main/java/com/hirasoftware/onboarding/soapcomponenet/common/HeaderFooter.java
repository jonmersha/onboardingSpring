package com.hirasoftware.onboarding.soapcomponenet.common;

public class HeaderFooter {
    public static String getAccountCreate(){

        return "<soapenv:Envelope \n" +
                "\txmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
                "\txmlns:cus=\"http://temenos.com/CUSTONBRD\" \n" +
                "\txmlns:acc=\"http://temenos.com/ACCOUNTOPENPOC\">\n" +
                "\t<soapenv:Header/>\n" +
                "\t<soapenv:Body>\n" +
                "\t\t<cus:ACCOUNTOPEN>\n" +
                "\t\t\t%s%s%s\n" +
                "\t\t</cus:ACCOUNTOPEN>\n" +
                "\t</soapenv:Body>\n" +
                "</soapenv:Envelope>";
    }
}
