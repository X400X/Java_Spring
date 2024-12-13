package com.smirnovkoss.hibernate_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.smirnovkoss.hibernate_test.entity.Employees;

public class TestHibernateCREATEandREAD {
	public static void main(String[] args) {
		
		 List<String> firstNames = new ArrayList<>();
	        firstNames.add("John");
	        firstNames.add("Emma");
	        firstNames.add("Michael");
	        firstNames.add("Olivia");
	        firstNames.add("William");
	        firstNames.add("Sophia");
	        firstNames.add("James");
	        firstNames.add("Isabella");
	        firstNames.add("Benjamin");
	        firstNames.add("Mia");
	        firstNames.add("Lucas");
	        firstNames.add("Charlotte");
	        firstNames.add("Henry");
	        firstNames.add("Amelia");
	        firstNames.add("Alexander");
	        firstNames.add("Evelyn");
	        firstNames.add("Daniel");
	        firstNames.add("Abigail");
	        firstNames.add("Matthew");
	        firstNames.add("Harper");
	        
	        List<String> surnames = new ArrayList<>();
	        surnames.add("Smith");
	        surnames.add("Johnson");
	        surnames.add("Williams");
	        surnames.add("Brown");
	        surnames.add("Jones");
	        surnames.add("Garcia");
	        surnames.add("Miller");
	        surnames.add("Davis");
	        surnames.add("Rodriguez");
	        surnames.add("Martinez");
	        surnames.add("Hernandez");
	        surnames.add("Lopez");
	        surnames.add("Gonzalez");
	        surnames.add("Wilson");
	        surnames.add("Anderson");
	        surnames.add("Thomas");
	        surnames.add("Taylor");
	        surnames.add("Moore");
	        surnames.add("Jackson");
	        surnames.add("Martin");

	        String randomFirstName = getRandomElement(firstNames);
	        String randomSurname = getRandomElement(surnames);
	        String randomDepertment = getRandomDepartment();
	        int randomSalary = getRandomSalary();


	        System.out.println("Random full name: " + randomFirstName + " " + randomSurname + " " + randomDepertment + " " + randomSalary);
		
	        
	        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            Employees newUser = new Employees(randomFirstName, randomSurname,randomDepertment,randomSalary);

            session.save(newUser); 

            session.getTransaction().commit();
            
            
            int myID = newUser.getId();
            
            session = factory.getCurrentSession();
            session.beginTransaction();
            
            Employees employee = session.get(Employees.class, myID);
            session.getTransaction().commit();

            System.out.println(employee);
        } finally {
            factory.close();
        }
	
		
	
	}
	
	public static String getRandomElement(List<String> list) {
	    Random random = new Random();
	    int index = random.nextInt(list.size());
	    return list.get(index);
	}	
	
	public static String getRandomDepartment() {
        String[] departments = {"IT", "HR", "Marketing", "Sales", "Finance"};
        Random random = new Random();
        int index = random.nextInt(departments.length); 
        return departments[index];
    }

    public static int getRandomSalary() {
        Random random = new Random();
        return 500 + random.nextInt(1501 - 500);
    }
}
