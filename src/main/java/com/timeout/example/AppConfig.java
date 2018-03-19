package com.timeout.example;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import(AuthConfig.class)
public class AppConfig {
	
	@Bean
	public ClientController controller() {
		return new ClientController();
	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		SpringApplication.run(AppConfig.class, args);
	}

}
