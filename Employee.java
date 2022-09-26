package com.que1;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparator<Employee> {
	
	private int empId;
	private String name;
	private int salary;
	
	
	public Employee() {
		super();
	}


	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}




	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary())
			return -1;
		else if(o1.getSalary()<o2.getSalary()) {
			return 1;
		}
		else {
			return 0;
		}
	}


	
	
	
	
	

}
