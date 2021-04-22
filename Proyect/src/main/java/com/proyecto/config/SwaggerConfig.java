package com.proyecto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket mailApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.proyecto.controller")) 
				.paths(PathSelectors.any())
				.build()
				.apiInfo(mailApiInfo());
	}

	private ApiInfo mailApiInfo() {
		return new ApiInfoBuilder()
				.title("My Spring Boot REST API")
				.description("PROYECTO REST API")
				.contact(new Contact("Web App Proyecto", "", "davargas12@poligran.edu.co"))
				.version("0.0.1")
				.build();
	}
}