package com.hirasoftware.onboarding.soapcomponenet.account;

public class AccountBasicType {

    String customerID;
    String productCode;
    String currency;

    public AccountBasicType(String customerID, String productCode, String currency) {
        this.customerID = customerID;
        this.productCode = productCode;
        this.currency = currency;
    }

    public String getBasicBody(){

        String soapBody=String.format("\t\t\t\t<acc:CustomerID>%s</acc:CustomerID>\n" +
                "\t\t\t\t<acc:ProductCode>%s</acc:ProductCode>\n" +
                "\t\t\t\t<acc:Currency>%s</acc:Currency>\n" +
                "\t\t\t\t<acc:LimitRef></acc:LimitRef>\n" +
                "\t\t\t\t<acc:AccountOfficer></acc:AccountOfficer>\n" +
                "\t\t\t\t<acc:LinktoLimitYN></acc:LinktoLimitYN>\n" +
                "\t\t\t\t<acc:HVTFlag></acc:HVTFlag>\n" +
                "\t\t\t\t<acc:SingleLimitYN></acc:SingleLimitYN>\n" +
                "\t\t\t\t<acc:MaximumSubAccount></acc:MaximumSubAccount>",this.customerID,this.productCode,this.currency);

        return soapBody;
    }
}
