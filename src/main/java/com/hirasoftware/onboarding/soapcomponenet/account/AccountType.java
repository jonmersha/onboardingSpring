package com.hirasoftware.onboarding.soapcomponenet.account;

import com.hirasoftware.onboarding.model.Account;

public class AccountType {
  Account account;

    public AccountType(Account account) {
        this.account = account;
    }

    //String customerID, String productCode, String currency
    public String getAccountType(){
        String accountTypeBody=String.format(
                "\t<ACCOUNTOPENPOCType id=\"\">\n" +
                "\t\t\t\t%s%s%s\n" +
                "\t\t\t</ACCOUNTOPENPOCType>",
                new AccountShortTitle("1",account.shortName).getAccountType(),
                new AccountTitle("1",account.shortName).getAccountType(),
                new AccountBasicType(account.customerID,account.productCode,account.currency).getBasicBody());
        return accountTypeBody;
    }


}
