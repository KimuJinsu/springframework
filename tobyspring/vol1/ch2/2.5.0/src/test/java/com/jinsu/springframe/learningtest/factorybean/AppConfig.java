package com.jinsu.springframe.learningtest.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public MyCustomObjectFactoryBean myCustomObjectFactory() {
		MyCustomObjectFactoryBean factoryBean = new MyCustomObjectFactoryBean();
		return factoryBean;
	}
	
	@Bean
	public MyCustomObject myCustomObject() throws Exception {
		return myCustomObjectFactory().getObject(); 
		}

}



