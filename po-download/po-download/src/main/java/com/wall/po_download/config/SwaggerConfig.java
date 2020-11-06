package com.wall.po_download.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Po-Download").select()
				.apis(RequestHandlerSelectors.basePackage("com.wall.po_download.controller")).
				build().apiInfo(apiInfo());

	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Po-Download", "", "1.0", "", new Contact("Ram", "", "abc@gmail.com"), "Apache License", "",
				Arrays.asList());
	}
}
