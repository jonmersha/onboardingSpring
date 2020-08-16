package com.hirasoftware.onboarding.soapcomponenet.account;

public class AccountShortTitle {
    public String g;
    public String shortTitle;

    public AccountShortTitle(String g, String shortTitle) {
        this.g = g;
        this.shortTitle = shortTitle;
    }

    public String getAccountType(){
    String shortTitle=String.format(
            "<acc:gSHORTTITLE g=\"%s\">\n" +
                    "\t\t\t\t\t<acc:ShortName>%s</acc:ShortName>\n" +
                    "\t\t\t\t</acc:gSHORTTITLE>\n",
            this.g,
            this.shortTitle);
        return shortTitle;
}
}
