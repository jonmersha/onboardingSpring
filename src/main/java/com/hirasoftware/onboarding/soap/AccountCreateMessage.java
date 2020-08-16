package com.hirasoftware.onboarding.soap;

import com.hirasoftware.onboarding.soapcomponenet.*;
import com.hirasoftware.onboarding.soapcomponenet.common.OFS;
import com.hirasoftware.onboarding.soapcomponenet.common.WebRequestCommon;
import com.hirasoftware.onboarding.soapcomponenet.customer.CustomerDataSingle;
import com.hirasoftware.onboarding.soapcomponenet.customer.CustomerInputType;

public class AccountCreateMessage {


	String xml="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" + 
			"xmlns:cus=\"http://temenos.com/CUSTONBRD\"\n" + 
			"xmlns:cus1=\"http://temenos.com/CUSTOMERINPUT\">\n" + 
			"<soapenv:Header/>\n" + 
			"<soapenv:Body>\n" + 
			"<cus:CUSTCREATE>\n" + 
			"<WebRequestCommon>\n" + 
			"<company>%s</company>\n" + 
			"<password>%s</password>\n" + 
			"<userName>%s</userName>\n" + 
			"</WebRequestCommon>\n" + 
			"<OfsFunction>\n" + 
			"<messageId>%s</messageId>\n" + 
			"</OfsFunction>\n" + 
			"<CUSTOMERINPUTType id=\"\">\n" + 
			"<cus1:Mnemonic>%s</cus1:Mnemonic>\n" + 
			"<cus1:gSHORTNAME g=\"1\">\n" + 
			"<cus1:ShortName>%s</cus1:ShortName>\n" + 
			"</cus1:gSHORTNAME>\n" + 
			"<cus1:gNAME1 g=\"1\">\n" + 
			"<cus1:FullName>%s</cus1:FullName>\n" + 
			"</cus1:gNAME1>\n" + 
			"<cus1:Sector>%s</cus1:Sector>\n" + 
			"<cus1:AccountOfficer>%s</cus1:AccountOfficer>\n" + 
			"<cus1:Industry>%s</cus1:Industry>\n" + 
			"<cus1:Target>%s</cus1:Target>\n" + 
			"<cus1:Nationality>%s</cus1:Nationality>\n" + 
			"<cus1:Residence>%s</cus1:Residence>\n" + 
			"<cus1:Language>%s</cus1:Language>\n" + 
			"<cus1:TITLE>%s</cus1:TITLE>\n" + 
			"<cus1:GIVENNAMES>%s</cus1:GIVENNAMES>\n" + 
			"<cus1:Gender>%s</cus1:Gender>\n" + 
			"<cus1:MaritalStatus>%s</cus1:MaritalStatus>\n" + 
			"<cus1:CustomerType></cus1:CustomerType>\n" + 
			"</CUSTOMERINPUTType>\n" + 
			"</cus:CUSTCREATE>\n" + 
			"</soapenv:Body>\n" + 
			"</soapenv:Envelope>\n" + 
			"";
	
	
	public String company;
	public String firstName;
	public String middleName;
	public String lastName;
	private String password;
	private String userName;
	private String messageID;
	private String Mimonic;
	private String shortName;
	private String fullName;
	private String sector;
	private String industry;
	private String target;
	private String nationality;
	private String residence;
	private String language;
	private String title;
	private String givenName;
	private String gender;
	private String accountOfficer;
	private String maritalStatus;
	
	
	
	public String getCustomerMessage() {
		
		String customerMessage=String.format(xml,
				company,
				password,
				userName,
				messageID,
				Mimonic,
				shortName,
				fullName,
				sector,
				accountOfficer,
				industry,
				target,
				nationality,
				residence,
				language,
				title,
				givenName,
				gender,
				maritalStatus
				);
		
		return customerMessage;}


		public String getCustomerMessages(){

			OFS ofs=new OFS(messageID);
			WebRequestCommon webRequestCommon=new WebRequestCommon(company,password,userName);
			CustomerInputType customerInputType=new CustomerInputType(
					new GName("1",firstName,middleName,lastName),
					new ShortName("1",firstName),
					new CustomerDataSingle(
							sector,
							accountOfficer,
							industry,target,
							nationality,
							residence,
							language,
							title,
							givenName,
							gender,
							maritalStatus));

		return "";
		}

}
