package de.htw.su;


public class Employee {
	
	private String name;
	private EmployeeCategory category;
	private double basicSalary = 1000;
	

	public Employee (String name, EmployeeCategory category, double basicSalary) {
	  this.name = name;
	  this.category = category;
	  this.basicSalary  = basicSalary;
  }

		
	/* Calculate the salary in dependence from the employee category */
	public double calculateSalary () {
		return category.calculateSalary(this.getEmployeeCategory(),this.getBasicSalary());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public EmployeeCategory getEmployeeCategory() {
		return category;
	}
	public void setEmployeeCategory(EmployeeCategory category) {
		this.category = category;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;		
	}
	public double getBasicSalary() {
		return basicSalary;
	}
}
