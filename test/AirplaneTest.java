package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Airline;
import main.Airplane;
import main.Flight;

public class AirplaneTest {
	
	Airplane airplane;
	Airline airline;
	Airline airline2;
	Flight flight1;
	Flight flight2;
	ArrayList<Flight> flightList;
	
	@Before
	public void setUp() {
		airline = new Airline("Beelzebub Airlines", "Hell");
		airline2 = new Airline("HerpyDerpHerp", "Derp");
		airplane = new Airplane("Boeing666", 444, 13, 1, 0, airline);
		flight1 = new Flight("BA007",Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()),"London Heathrow", "New York JFK", 2);
		flight2 = new Flight("AA201",Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()),"London Heathrow", "New York JFK", 2);
		flightList = new ArrayList<>();
		flightList.add(flight1);
		flightList.add(flight2);
		airplane.setFlightList(flightList);
	}
	
	@Test
	public void testGetName() {
		assertEquals("Boeing666", airplane.getName());
	}
	
	@Test
	public void testSetName() {
		airplane.setName("Boeing444");
		assertEquals("Boeing444", airplane.getName());
		assertThrows(NullPointerException.class, () -> {airplane.setName(null);});
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
	public void testGetSeats() {
		assertEquals(1, airplane.getSeats());
	}
	
	@Test
	public void testSetSeats() {
		airplane.setSeats(2);
		assertEquals(2, airplane.getSeats());
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
	public void testGetAirline() {
		assertEquals(airline, airplane.getAirline());
	}
	
	@Test
	public void testSetAirline() {		
		airplane.setAirline(airline2);
		assertEquals(airline2, airplane.getAirline());
		assertThrows(NullPointerException.class, () -> {airplane.setAirline(null);});
	}
	
	@Test
	public void testGetFlightList() {
		assertEquals(flightList, airplane.getFlightList());
	}
	
	@Test
	public void testSetFlightList() {
		ArrayList<Flight> newFlightList = new ArrayList<>();
		newFlightList.add(flight1);
		airplane.setFlightList(newFlightList);
		assertEquals(newFlightList, airplane.getFlightList());
		assertThrows(NullPointerException.class, () -> {airplane.setFlightList(null);});
	}
}
