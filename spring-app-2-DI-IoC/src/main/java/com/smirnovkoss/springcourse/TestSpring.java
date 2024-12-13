package com.smirnovkoss.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main (String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = context.getBean("myPerson", Person.class);
		
		person.callYourPet();
		
		//System.out.println(testBean.getName());
		
		context.close();
	}

}
