package br.com.projetopizzaria.pizzariaDH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class PizzariaDhApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaDhApplication.class, args);
	}

}
