package com.smirnovkoss.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrerary {
	
	
//	@Override
	public void getBook(String book) {
		System.out.println("This is you Book from UniLibrary!" + book);
	}
	
	public void getBook(Book book) {
		System.out.println("This is you Book from UniLibrary! " + book.getName());
	}

	public void getMagazine() {
		System.out.println("This is you Magazine from UniLibrary!");
	}
	
	public void getBook() {
		System.out.println("This is you Book from UniLibrary! + 0");
		System.out.println("----------------------------------------------------------");
	}
	
	public void returnBook() {
		System.out.println("return Bokk to UniLibrary!");
	}
	
	public void returnMagazine() {
		System.out.println("return Magazine from UniLibrary!");
	}
	
	public void addBook() {
		System.out.println("we added Book in UniLibrary! + 0");
	}
	
	public void addMagazine() {
		System.out.println("we added Magazine in UniLibrary!");
	}
}
