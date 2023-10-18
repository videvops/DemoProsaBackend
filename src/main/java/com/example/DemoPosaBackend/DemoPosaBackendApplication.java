package com.example.DemoPosaBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoPosaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPosaBackendApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("/**");
			}
		};
		return webMvcConfigurer;
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}


}
