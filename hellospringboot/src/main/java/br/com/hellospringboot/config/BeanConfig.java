package br.com.hellospringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BeanConfig {

//	@Bean
//	public UserRepository userRepository() {
//		return new UserRepository();
//	}

	@Bean
	@SessionScope
	public BeanTeste beanTeste() {
		return new BeanTeste();
	}

}
