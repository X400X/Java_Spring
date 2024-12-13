package com.smirnovkoss.springcourse;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.smirnovkoss.springcourse")  //if search annotation
@PropertySource("classpath:myApp.properties")
public class MyConfig {

	@Bean
	@Scope("singleton")
	public Pet foxBean() {
		return new Fox();
	}
	
	@Bean
	public Humon humonBean() {
		return new Humon(foxBean());
	}
}
