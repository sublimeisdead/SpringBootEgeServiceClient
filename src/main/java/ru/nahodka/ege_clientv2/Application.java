
package ru.nahodka.ege_clientv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.io.*;
import java.util.Properties;




@SpringBootApplication
public class Application {

static Properties properties;

	static {
		try {
			properties = PropertiesLoader.getProperties();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private static final org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	@Bean
	CommandLineRunner lookup (Client quoteClient){

		return args -> {
	try {
		SMEV3Provider SMEV3Provider =new SMEV3Provider(quoteClient);
		SMEV3Provider.sign();

		StatusListener.listen();
	}catch (Exception e){
		logger.error(e);
		e.printStackTrace();
	}
		};

	}

}


