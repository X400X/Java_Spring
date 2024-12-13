package com.smirnovkoss.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithJavaClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Person person = con.getBean("personBean", Person.class);
		person.callYourPet();
		
		con.close();
	}

}
