package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//@EnableEurekaClient
@SpringBootApplication
public class SpringMongoDbDemo1Application  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbDemo1Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringMongoDbDemo1Application.class);
	}

}
