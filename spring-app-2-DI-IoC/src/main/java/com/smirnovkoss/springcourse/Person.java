package com.smirnovkoss.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
	@Autowired
	@Qualifier("dog")
	private Pet pet;
//	@Value("Serov")
//	@Value("${person.sname}")
	private String sname;
//	@Value("${person.age}")
	private int age;


	
	
//	@Autowired 
//	public Person(@Qualifier("dog") Pet pet) { this.pet = pet; }
	 
	
	
	public Person() { }
	 
	 
	public void callYourPet() {
		System.out.println("Helllo my Pet!");
		pet.say();
		System.out.println(sname);
		System.out.println(age);
	}

	
//	@Autowired 
//	@Qualifier("dog")
//	public void setPet(Pet pet) { this.pet = pet; }
	 
	
	
	
//	@Autowired
//	@Qualifier("dog")
//	public void setPetTest(Pet pet) { this.pet = pet; }
	 
	
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
