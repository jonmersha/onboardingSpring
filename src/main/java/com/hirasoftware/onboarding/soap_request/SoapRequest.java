package com.hirasoftware.onboarding.soap_request;

import javax.xml.soap.*;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class SoapRequest {

public SOAPMessage soapRequest(String soapMessage){
    SOAPConnectionFactory soapConnectionFactory = null;
    try {
        soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        String url = "http://197.156.76.22:9095/TWSMMT/services";
        return soapConnection.call(getSoapMessageFromString(soapMessage), url);
    } catch (SOAPException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return null;
}
public SOAPMessage getSoapMessageFromString(String xml) throws SOAPException, IOException {
    MessageFactory factory = MessageFactory.newInstance();
    SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
    return message;
    }
//    private static String printSOAPResponse(SOAPMessage soapResponse) throws Exception {
//        TransformerFactory transformerFactory = TransformerFactory.newInstance();
//        Transformer transformer = transformerFactory.newTransformer();
//        Source sourceContent = soapResponse.getSOAPPart().getContent();
//
////        System.out.print("\nResponse SOAP Message = ");
////        StreamResult result = new StreamResult(System.out);
////        transformer.transform(sourceContent, result);
//    }

}
