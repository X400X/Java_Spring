package com.smirnovkoss.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithJavaClass2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Humon humon = con.getBean("humonBean", Humon.class);
		humon.callYourPet();
		
//		Pet pet = con.getBean("foxBean",Pet.class);
//		pet.say();
		
		
		con.close();

	}

}
