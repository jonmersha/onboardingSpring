package com.hirasoftware.onboarding.soapcomponenet.customer;

import com.hirasoftware.onboarding.soapcomponenet.GName;
import com.hirasoftware.onboarding.soapcomponenet.ShortName;

public class CustomerInputType {
    //shortName
    //gname
    //Customer Data
    GName fullName;
    ShortName shortName;
    CustomerDataSingle customerInputBasic;

    public CustomerInputType(GName fullName, ShortName shortName, CustomerDataSingle customerInputBasic) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.customerInputBasic = customerInputBasic;
    }

    public String getcustomerInputType(){

        String customerinputType=String.format("<CUSTOMERINPUTType id=\"\">\n"
        		+ "%s%s%s"
        		+ "</CUSTOMERINPUTType>\n",
               shortName.getShortName(),fullName.getFullName(),customerInputBasic.getCustomerInputType() );
        return customerinputType;
    }
}
