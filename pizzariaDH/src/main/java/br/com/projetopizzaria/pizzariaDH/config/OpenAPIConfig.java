package br.com.projetopizzaria.pizzariaDH.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI customizarSwagger() {
		return new OpenAPI().info(new Info().title("RESTful API - Projeto integrador Digital House - Backend Java")
				.version("v1").description("API desenvolvida para o projeto integrador - Java DH/Santander")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
