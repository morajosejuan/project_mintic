package com.papeleriagrafiti.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PapeleriaGrafitiApplication extends SpringBootServletInitializer	 {
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PapeleriaGrafitiApplication.class);
		
	}


	public static void main(String[] args) {
		SpringApplication.run(PapeleriaGrafitiApplication.class, args);
	}

}
