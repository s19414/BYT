package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

import main.Employee;

public class EmployeeTest {
	
	Employee employee;
	
	@Before
	public void setUp() {
		employee = new Employee("Steve", "Works");
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("Steve", employee.getFirstName());
	}
	
	@Test
	public void testSetFirstName() {
		employee.setFirstName("Mark");
		assertEquals("Mark", employee.getFirstName());
		assertThrows(NullPointerException.class, () -> {employee.setFirstName(null);});
		assertThrows(IllegalArgumentException.class, () -> {employee.setFirstName("123");});
	}
	
	@Test
	public void testGetLastName() {
		assertEquals("Works", employee.getLastName());
	}
	
	@Test
	public void testSetLastName() {
		employee.setLastName("Byron");
		assertEquals("Byron", employee.getLastName());
		assertThrows(NullPointerException.class, () -> {employee.setLastName(null);});
		assertThrows(IllegalArgumentException.class, () -> {employee.setLastName("Mark12367");});
	}

}
