package com.hirasoftware.onboarding.soapcomponenet.account;

public class AccountTitle {
    public String g;
    public String accountName;

    public AccountTitle(String g, String accountName) {
        this.g = g;
        this.accountName = accountName;
    }

    public String getAccountType(){
        String typeBody=String.format(
                "\t\t\t\t<acc:gACCOUNTTITLE1 g=\"%s\">\n" +
                "\t\t\t\t\t<acc:AccountName1>%s</acc:AccountName1>\n" +
                "\t\t\t\t</acc:gACCOUNTTITLE1>\n",g,this.accountName);
        return typeBody;
    }
}
