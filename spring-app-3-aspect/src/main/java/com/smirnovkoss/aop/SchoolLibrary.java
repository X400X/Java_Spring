package com.smirnovkoss.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrerary {

//	@Override
	public void getBook() {
		System.out.println("This is you Book from SchoolLibrary!");
	}

}
