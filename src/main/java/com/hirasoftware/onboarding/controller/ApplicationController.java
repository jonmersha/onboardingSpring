package com.hirasoftware.onboarding.controller;


import com.hirasoftware.onboarding.model.Account;
import com.hirasoftware.onboarding.soap_request.SoapRequest;
import com.hirasoftware.onboarding.soap_response.ResponseProcessor;
import com.hirasoftware.onboarding.soapcomponenet.account.AccountCreate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hirasoftware.onboarding.model.Customer;
import com.hirasoftware.onboarding.soap.CustomerCreateMessage;

import javax.xml.soap.SOAPMessage;

@Controller
@RestController
public class ApplicationController {
	@GetMapping("/")
	public String goHome() {
		return "index";
	}
	@PostMapping("/customer_creation")
	public Customer  customerCreation(@RequestBody Customer customer) {
		
		CustomerCreateMessage messagbody=new CustomerCreateMessage();
		String MessageBodhy=messagbody.getCustomerMessage(customer);
		System.out.println(MessageBodhy);
		return customer;
	}
	@PostMapping("/account_creation")
	public Account  accountCreation(@RequestBody Account account) {
		AccountCreate accountCreate=new AccountCreate(account);
		String soapBody=accountCreate.getSoapMessage();
		System.out.println(soapBody);
		return account;
	}

	@GetMapping("/test")
	public String  testSoapEnd(@RequestBody Account account) {
		String soapMessage = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:mmt=\"http://temenos.com/MMT\">\n" +
				"   <soapenv:Header/>\n" +
				"   <soapenv:Body>\n" +
				"      <mmt:ACCOUNTVIEW>\n" +
				"         <WebRequestCommon>\n" +
				"          <company>ET0010001</company>\n" +
				"		<password>654321</password>\n" +
				"		<userName>MMTUSER1</userName>\n" +
				"         </WebRequestCommon>\n" +
				"         <ACCTVIEWType>\n" +
				"            <!--Zero or more repetitions:-->\n" +
				"            <enquiryInputCollection>\n" +
				"               <!--Optional:-->\n" +
				"               <columnName>?</columnName>\n" +
				"               <!--Optional:-->\n" +
				"               <criteriaValue>?</criteriaValue>\n" +
				"               <!--Optional:-->\n" +
				"               <operand>?</operand>\n" +
				"            </enquiryInputCollection>\n" +
				"         </ACCTVIEWType>\n" +
				"      </mmt:ACCOUNTVIEW>\n" +
				"   </soapenv:Body>\n" +
				"</soapenv:Envelope>";


		SOAPMessage soapResponse=new SoapRequest().soapRequest(soapMessage);

		String responseTYpe=new ResponseProcessor().responseParser(soapResponse);



		return responseTYpe;
	}

}
