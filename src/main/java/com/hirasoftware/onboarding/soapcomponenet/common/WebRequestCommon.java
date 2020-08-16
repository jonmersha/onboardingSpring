package com.hirasoftware.onboarding.soapcomponenet.common;

public class WebRequestCommon {
    public String company;
    public String passWord;
    public String userName;

    public WebRequestCommon(String company, String passWord, String userName) {
        this.company = company;
        this.passWord = passWord;
        this.userName = userName;
    }
    public String getWebRequestCommon(){
        String body=String.format(
                "<WebRequestCommon>\n" +
                "\t\t\t\t<company>%s</company>\n" +
                "\t\t\t\t<password>%s</password>\n" +
                "\t\t\t\t<userName>%s</userName>\n" +
                "\t\t\t</WebRequestCommon>\n", this.company,this.passWord,this.userName);
        return body;
    }

}
