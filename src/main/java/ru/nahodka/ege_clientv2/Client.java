
package ru.nahodka.ege_clientv2;


import clientv2.wsdl.NewRequestType;
import clientv2.wsdl.NewResponseType;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.nahodka.ege_clientv2.interception.LogHttpHeaderClientInterceptor;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.IOException;


public class Client extends WebServiceGatewaySupport {

	//public Client(){
	//	this.setInterceptors(new ClientInterceptor[] {new LogHttpHeaderClientInterceptor()});
	//}

	public JAXBElement<NewResponseType> manageRequest(NewRequestType newRequestType) throws IOException {

		QName qName=new QName("urn://x-artefacts-coko/ege/services/1.0.0","NewRequest");
		JAXBElement<NewRequestType> req=new JAXBElement<>(qName,NewRequestType.class,newRequestType);



		JAXBElement<NewResponseType> response = (JAXBElement<NewResponseType>) getWebServiceTemplate()
				.marshalSendAndReceive(PropertiesLoader.getProperties().getProperty("uri.soap"), req,
						new SoapActionCallback(
								"urn://nahodka.ru/services/eventService/manageRequest"));
		return response;

	}


}
