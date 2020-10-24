import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstTdd {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}


	Account obj;
	
	@BeforeEach
	void setUp() throws Exception {
		obj = new Account();
		
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
		obj.setFirstName("Ganiu");
//		System.out.println(obj.getFirstName());
		assertEquals("Ganiu", obj.getFirstName());
	}
	
	@Test
	void checkForLastName() {
		assertEquals(null, obj.getLastName());
	}
	
	@Test
	void setLastName() {
		obj.setLastName("Adewale");
		assertEquals("Adewale", obj.getLastName());
	}
	
	@Test
	void checkForAccountBalance() {
		
		assertEquals(0.0, obj.getBalance());
	}
	
	
	@Test
	void setAccountBalance() {
		obj.setAccountBalance(5.5);
		assertEquals(5.5, obj.getBalance());

	}
	
	
	
	@Test
	void checkForAccountNumber() {
		
		assertEquals(null, obj.getAccountNumber());
	}
	
	@Test
	void setAccountNumber() {
		obj.setAccountNumber("0014236108");
		assertEquals("0014236108", obj.getAccountNumber());

	}
	
	@Test
	void checkForAccountPin() {
		assertEquals(null, obj.getAccountPin());
	}
	
	@Test
	void setAccountPin() {
		obj.setAccountPin("1234");
		assertEquals("1234",obj.getAccountPin());
	}
	
	@Test
	void setAccountDeposit() {
		obj.setAccountDeposit();
		assertEquals(0.0,obj.getAccountDeposit());
	}
	
	@Test
	void checkForAccountWithDrawal() {
		assertEquals(0.0, obj.getAccountWithDraw());
	}
	
	@Test
	void setAccountWithDraw() {
		obj.setAccountWithDraw(0.0);
		assertEquals(0.0, obj.getAccountWithDraw());
	}
}
