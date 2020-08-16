package com.hirasoftware.onboarding.soap;

import com.hirasoftware.onboarding.model.Customer;
import com.hirasoftware.onboarding.soapcomponenet.*;
import com.hirasoftware.onboarding.soapcomponenet.common.OFS;
import com.hirasoftware.onboarding.soapcomponenet.common.WebRequestCommon;
import com.hirasoftware.onboarding.soapcomponenet.customer.CustomerCreate;
import com.hirasoftware.onboarding.soapcomponenet.customer.CustomerDataSingle;
import com.hirasoftware.onboarding.soapcomponenet.customer.CustomerInputType;

public class CustomerCreateMessage {
	
	public String getCustomerMessage(Customer customer){

		OFS ofs=new OFS(customer.messageID);
		WebRequestCommon webRequestCommon=new WebRequestCommon(customer.company,customer.password,customer.userName);
		CustomerInputType customerInputType=new CustomerInputType(
				new GName("1",customer.firstName,customer.middleName,customer.lastName),
				new ShortName("1",customer.firstName),
				new CustomerDataSingle(
						customer.sector,
						customer.accountOfficer,
						customer.industry,
						customer.target,
						customer.nationality,
						customer.residence,
						customer.language,
						customer.title,
						customer.givenName,
						customer.gender,
						customer.maritalStatus));
		return new CustomerCreate(webRequestCommon,ofs,customerInputType).getCustomerCreateMessage();
	}

}
