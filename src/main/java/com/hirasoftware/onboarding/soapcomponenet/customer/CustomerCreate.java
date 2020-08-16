package com.hirasoftware.onboarding.soapcomponenet.customer;

import com.hirasoftware.onboarding.soapcomponenet.common.OFS;
import com.hirasoftware.onboarding.soapcomponenet.common.WebRequestCommon;

public class CustomerCreate {
    //web request common
    //ofs function
    //customer input type
    WebRequestCommon webRequestCommon;
    OFS ofs;
    CustomerInputType customerInputType;


    public CustomerCreate(WebRequestCommon webRequestCommon, OFS ofs, CustomerInputType customerInputType) {
        this.webRequestCommon = webRequestCommon;
        this.ofs = ofs;
        this.customerInputType = customerInputType;
    }

    public String getCustomerCreateMessage(){
        String messageBody=String.format(
                        "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
                "xmlns:cus=\"http://temenos.com/CUSTONBRD\"" +
                "xmlns:cus1=\"http://temenos.com/CUSTOMERINPUT\">\n" +
                "<soapenv:Header/>\n" +
                "<soapenv:Body>\n" +
                "\t<cus:CUSTCREATE>" +
                        "%s%s%s" +
                                "\t</cus:CUSTCREATE>\n" +
                "</soapenv:Body>\n" +
                "</soapenv:Envelope>",
                webRequestCommon.getWebRequestCommon(),
                this.ofs.getOFSBody(),
                customerInputType.getcustomerInputType()
                );
        return messageBody;
    }


}
