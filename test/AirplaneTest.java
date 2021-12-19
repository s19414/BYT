package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.Airline;
import main.Airplane;

public class AirplaneTest {
	
	Airplane airplane;
	Airline airline;
	Airline airline2;
	
	@Before
	public void setUp() {
		airline = new Airline("Beelzebub Airlines", "Hell");
		airline2 = new Airline("HerpyDerpHerp", "Derp");
		airplane = new Airplane("Boeing666", 444, 13, 1, 0, airline);
	}
	
	@Test
	public void testGetName() {
		assertEquals("Boeing666", airplane.getName());
	}
	
	@Test
	public void testSetName() {
		airplane.setName("Boeing444");
		assertEquals("Boeing444", airplane.getName());
	}
	
	@Test
	public void testGetModel() {
		assertEquals(444, airplane.getModel());
	}
	
	@Test
	public void testSetModel() {
		airplane.setModel(4);
		assertEquals(4, airplane.getModel());
	}
	
	@Test
	public void testGetRegistrationId() {
		assertEquals(13, airplane.getRegistrationId());
	}
	
	@Test
	public void testSetRegistrationId() {
		airplane.setRegistrationId(170);
		assertEquals(170, airplane.getRegistrationId());
	}
	
	@Test
	public void testGetSits() {
		assertEquals(1, airplane.getSits());
	}
	
	@Test
	public void testSetSits() {
		airplane.setSits(2);
		assertEquals(2, airplane.getSits());
	}
	
	@Test
	public void testGetLimitOfKg() {
		assertEquals(0, airplane.getLimitOfKg());
	}
	
	@Test
	public void testSetLimitOfKg() {
		airplane.setLimitOfKg(1);
		assertEquals(1, airplane.getLimitOfKg());
	}
	
	@Test
	public void testAddFlight() {
		assertEquals("a Flight is added", airplane.addFlight());
	}
	
	@Test
	public void testGetAirline() {
		assertEquals(airline, airplane.getAirline());
	}
	
	@Test
	public void testSetAirline() {
		
		airplane.setAirline(airline2);
		assertEquals(airline2, airplane.getAirline());
	}
}
