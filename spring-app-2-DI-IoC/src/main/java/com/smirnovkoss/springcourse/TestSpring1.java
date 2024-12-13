package com.smirnovkoss.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Person person = context.getBean("personBean", Person.class);
		person.callYourPet();
		
		Cat cat = context.getBean("catBean", Cat.class);
		cat.say();

		context.close();
	}

}
