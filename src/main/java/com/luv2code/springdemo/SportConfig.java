package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@Configurable
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for out sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach And inject dependency
	@Bean Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
