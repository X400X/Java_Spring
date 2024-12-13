package com.smirnovkoss.hibernate_test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="department")
	private String department;
	
	@Column(name="salary")
	private int salary;

	public Employees() {}
	    
	public Employees(String first_name, String last_name, String department, int salary) {
	    this.first_name = first_name;
	    this.last_name = last_name;
	    this.department = department;
	    this.salary = salary;
	}
	
	@Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + first_name + '\'' +
                ", surname='" + last_name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getFirst_name() {
	    return first_name;
	}

	public void setFirst_name(String first_name) {
	   this.first_name = first_name;
	}

	public String getLast_name() {
	   return last_name;
	}

	public void setLast_name(String last_name) {
	    this.last_name = last_name;
	}
	
	public String getDepartment() {
		   return department;
		}

	public void setDepartment(String department) {
		   this.department = department;
		}
	
	public int getSalary() {
		   return salary;
		}

	public void setSalary(int salary) {
		   this.salary = salary;
		}
}
