package com.hirasoftware.onboarding.soapcomponenet.account;

import com.hirasoftware.onboarding.model.Account;

import com.hirasoftware.onboarding.soapcomponenet.common.HeaderFooter;
import com.hirasoftware.onboarding.soapcomponenet.common.OFS;
import com.hirasoftware.onboarding.soapcomponenet.common.WebRequestCommon;

public class AccountCreate {

    Account account;


    public AccountCreate(Account account) {
        this.account = account;
    }


    public String getSoapMessage(){


        String accountCreateSoapMessage=String.format(HeaderFooter.getAccountCreate(),
                new WebRequestCommon(account.company,account.passWord,account.userName).getWebRequestCommon(),
                new OFS(account.messageID).getOFSBody(),
                new AccountType(account).getAccountType());
        return accountCreateSoapMessage;

    }

}
