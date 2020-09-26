package ganiu_project;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		if(salary > 0.0)
			this.salary = salary;
		}
	
	public void setFirstName(String firstName) {
		 
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void setSalary(double salary) {
		
		if(salary > 0.0)
			
			this.salary = salary;
	}
	
	public double getSalary() {
		salary = salary * 12;
		return salary;
		
	}
	
	public double salaryIncrease() {
		double salary = getSalary();
		double newSalary = salary * 0.1;
		return newSalary;
	}
}
