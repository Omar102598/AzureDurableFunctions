package com.omar.azure_functions_hello.config;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
	public Function<String, String> echo() {
		return payload -> payload;
	}

	@Bean
	public Function<String, String> uppercase() {
		return payload -> payload.toUpperCase();
	}

	@Bean
	public Function<String, String> reverse() {
		return payload -> new StringBuilder(payload).reverse().toString();
	}

}
