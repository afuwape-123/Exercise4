
public class Employee {

	private String  firstName;
	private String lastName;
	private double salary;

	public String getFirstName() {
		return firstName;
		// TODO Auto-generated method stub
		
	}

	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	public Double getSalary() {
		salary = salary * 12;
		// TODO Auto-generated method stub
		return salary;
		
	}

	public void setSalary(double salary) {
		if(salary > 0.0)
			this.salary = salary;
		// TODO Auto-generated method stub
		
	}

	public double salaryIncrease(double salary) {
		 salary = getSalary();
		double newSalary = salary * 0.1;
		// TODO Auto-generated method stub
		return newSalary;
		
	}	
	
}
