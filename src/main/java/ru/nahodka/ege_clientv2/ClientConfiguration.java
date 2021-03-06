
package ru.nahodka.ege_clientv2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import ru.nahodka.ege_clientv2.interception.LogHttpHeaderClientInterceptor;

import java.io.IOException;

@Configuration
@EnableScheduling
@PropertySource("classpath:config.properties")
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
	public Client smevClient(Jaxb2Marshaller marshaller) throws IOException {
		Client client = new Client();
		client.setDefaultUri(PropertiesLoader.getProperties().getProperty("uri.soap"));
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		ClientInterceptor[] interceptors =
				new ClientInterceptor[] {new LogHttpHeaderClientInterceptor()};
		client.setInterceptors(interceptors);
		return client;
	}

}
