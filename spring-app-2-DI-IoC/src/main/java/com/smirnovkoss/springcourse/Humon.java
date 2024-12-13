package com.smirnovkoss.springcourse;

import org.springframework.beans.factory.annotation.Value;

public class Humon {
	private Pet pet;
	@Value("${person.sname}")
	private String sname;
	@Value("${person.age}")
	private int age;
	
	public Humon(Pet pet) {
		this.pet = pet;
	}

	public void callYourPet() {
		System.out.println("Helllo my Pet!");
		pet.say();
		System.out.println(sname);
		System.out.println(age);
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
