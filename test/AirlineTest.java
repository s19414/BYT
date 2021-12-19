package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Airline;
import main.Airplane;

public class AirlineTest {
	
	Airline airline;
	Airplane airplane;
	Airplane airplane2;
	ArrayList<Airplane> airplaneList;
	
	@Before
	public void setUp() {
		airline = new Airline("Test Airline", "Poland");
		airplane = new Airplane("Test1", 1, 1, 200, 30000, airline);
		airplane2 = new Airplane("Test2", 2, 2, 300, 34000, airline);
		airplaneList = new ArrayList<Airplane>();
		airplaneList.add(airplane);
		airline.setAirplaneList(airplaneList);
	}
	
	@Test
	public void testGetName() {
		assertEquals("Test Airline", airline.getName());
	}
	
	@Test
	public void testSetName() {
		airline.setName("New Test Airline");
		assertEquals("New Test Airline", airline.getName());
		assertThrows(NullPointerException.class, () -> {airline.setName(null);});
	}
	
	@Test
	public void testGetAddress() {
		assertEquals("Poland", airline.getAddress());
	}
	
	@Test
	public void testSetAddress() {
		airline.setAddress("Warsaw");
		assertEquals("Warsaw", airline.getAddress());
		assertThrows(NullPointerException.class, () -> {airline.setAddress(null);});
	}
	
	//test association
	@Test
	public void testgetAirplaneList() {
		assertEquals(airplaneList, airline.getAirplaneList());
	}
	
	@Test
	public void testSetAirplaneList() {
		ArrayList<Airplane> newList = new ArrayList<>();
		newList.add(airplane);
		airline.setAirplaneList(newList);
		assertEquals(newList, airline.getAirplaneList());
	}
}