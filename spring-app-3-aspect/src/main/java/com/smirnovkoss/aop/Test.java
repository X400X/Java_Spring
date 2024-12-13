package com.smirnovkoss.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		
//		Book book = con.getBean("book", Book.class);
		
		
		UniLibrary lib = con.getBean("uniLibrary", UniLibrary.class);
		lib.getBook();
		
		
		
//		lib.getMagazine();
//		lib.addBook();
//		lib.addMagazine();
		
		
		
		con.close();

	}

}
