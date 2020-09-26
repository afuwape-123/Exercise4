package ganiu_project;

public class EmployeeTest {
	
	public static void main(String[] args) {

		Employee staff1 = new Employee ("Bola", "Inyang", 10000.00);
		Employee staff2 = new Employee("Adewale", "Ademola", 5000.00);
		
		System.out.printf("%s %s%n",staff1.getFirstName(),staff1.getLastName());
		System.out.println("Salary for the year: " + staff1.getSalary());
		System.out.println("Salary after increase: " +staff1.salaryIncrease());
		System.out.println();

		

		System.out.printf("%s %s%n",staff2.getFirstName(),staff2.getLastName());
		System.out.println("Salary for the year: " + staff2.getSalary());
		System.out.println("Salary after increase: " +staff2.salaryIncrease());
	
		 }

} 
