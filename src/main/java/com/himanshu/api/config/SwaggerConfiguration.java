package com.himanshu.api.config;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	private ApiInfo metaData() {

		return new ApiInfoBuilder().title("Back Office Retail Applicaiton API ")
				.description("Rest API for Back Office Retail Applicaiton").version("0.0.1-SNAPSHOT").build();

	}

	@Bean
	public Docket boRetailApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(metaData()).select()
				.apis(RequestHandlerSelectors.basePackage("com.himanshu.api.controller")).paths(PathSelectors.any())
				.build();
	}

}
