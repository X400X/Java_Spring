package com.smirnovkoss.spring_rest_client;

import com.smirnovkoss.spring_rest_client.configuration.MyConfig;
import com.smirnovkoss.spring_rest_client.entity.Employee;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class)) {
			Communication communication = applicationContext.getBean("communication", Communication.class);

			
			List<Employee> allEmployees = communication.getAllEmployees();
			System.out.println(allEmployees);

			Employee employee = new Employee("Sveta", "Sokolova", "HR", 500);
			communication.saveEmployee(employee);
			
			
//			Employee employeeById = communication.getEmployee(4);
		
//			System.out.println(employee);
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
//
//        employee.setId(11);
//        employee.setSalary(1200);
//        employee.setDepartment("IT");
//
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(11);
    }
}