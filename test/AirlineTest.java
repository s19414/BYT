package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Airline;
import main.Airplane;

public class AirlineTest {
	
	Airline airline;
	Airplane airplane;
	
	@Before
	public void setUp() {
		airline = new Airline("Test Airline", "Poland");
		airplane = new Airplane("Test1", 1, 1, 200, 30000);
	}
	
	@Test
	public void testGetName() {
		assertEquals("Test Airline", airline.getName());
	}
	
	@Test
	public void testSetName() {
		airline.setName("New Test Airline");
		assertEquals("New Test Airline", airline.getName());
	}
	
	@Test
	public void testGetAddress() {
		assertEquals("Poland", airline.getAddress());
	}
	
	@Test
	public void testSetAddress() {
		airline.setAddress("Warsaw");
		assertEquals("Warsaw", airline.getAddress());
	}
	
	//test association

}
