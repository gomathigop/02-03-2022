package com.setters;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() 
	{

	}

	//setter methods
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}	
	
	//method
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) 
	{
		
		Employee employee = new Employee();
		
		//use setter methods to assign values to the variables		
		employee.setId(4204);
		employee.setName("Gomathi");
		employee.setSalary(68000.56);
		
		employee.getEmployeeInfo();
		
	}

}



