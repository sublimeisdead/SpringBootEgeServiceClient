
package ru.nahodka.ege_clientv2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import java.io.IOException;

@Configuration
@EnableScheduling
public class ClientConfiguration extends WsConfigurerAdapter {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("clientv2.wsdl");
		return marshaller;
	}

	@Bean
	public Client countryClient(Jaxb2Marshaller marshaller) throws IOException {
		Client client = new Client();
		client.setDefaultUri(PropertiesLoader.getProperties().getProperty("uri.soap"));
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
