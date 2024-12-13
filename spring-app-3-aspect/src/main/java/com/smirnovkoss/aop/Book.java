package com.smirnovkoss.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Value("ggggggg")
	String name;
	
	public String getName() {
		return name;
	}
}
