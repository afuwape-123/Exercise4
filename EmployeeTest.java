import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

	}
	
	Employee obj;
	
	@BeforeEach
	void setUp() throws Exception {
		
	 obj = new Employee();
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void test() {
		assertNotNull(obj);
	}

	@Test
	void checkForFirstName() {
		assertEquals(null, obj.getFirstName());
	}
	
	@Test
	void setFirstName() {
		obj.setFirstName("Adewale");
		assertEquals("Adewale", obj.getFirstName());
	}
	
	@Test
	void checkForLastName() {
		assertEquals(null, obj.getLastName());
	}
	
	@Test
	void setLastName() {
		obj.setLastName("Adeyinka");
		assertEquals("Adeyinka", obj.getLastName());
	}
	
	@Test
	void checkForEmployeeMonthlySalary() {
		assertEquals(0.0, obj.getSalary());	
	}
	
	@Test
	void testForSetEmployeeSalary() {
		obj.setSalary(1200.0);
		assertEquals(14400.0, obj.getSalary());
	}
	
	@Test
	void testForIncreaseOfEmployeeSalary() {
		obj.salaryIncrease(100.0);
	//	assertEquals(110.0, obj.getSalary());
		
	}
}
