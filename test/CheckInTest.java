package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import main.CheckIn;
import main.Flight;
import main.Passenger;
import main.Luggage;

public class CheckInTest {
	
	CheckIn checkIn;
	Flight flight1;
	Passenger passenger;
	ArrayList<Luggage> luggageList;
	Luggage luggage1;
	
	@Before
	public void setUp() {
		luggageList = new ArrayList<Luggage>();
		passenger = new Passenger("John", "Smith");
		luggage1 = new Luggage(1,Luggage.Category.HAND, 70, 2, passenger);
		luggageList.add(luggage1);
		passenger.setLuggages(luggageList);
		flight1 = new Flight("BA007", Date.from(Instant.now()), Date.from(Instant.now()),Date.from(Instant.now()),Date.from(Instant.now()),"London Heathrow", "New York JFK", 2);
		checkIn = new CheckIn(new Date(12345), flight1, passenger);
		
	}
	
	@Test
	public void testGetDate(){
		assertEquals(12345, checkIn.getDate().getTime());
	}
	
	@Test
	public void testSetDate() {
		checkIn.setDate(new Date(2000));
		assertEquals(2000, checkIn.getDate().getTime());
		assertThrows(NullPointerException.class, () -> {checkIn.setDate(null);});
	}
	
	@Test
	public void testGetHandLuggageWeight() {
		assertEquals(70, checkIn.getHandLuggageWeight(), 0);
	}
	
	@Test
	public void testGetFlight() {
		assertEquals(flight1, checkIn.getFlight());
	}
	
	@Test
	public void testSetFlight() {
		Flight flight2 = new Flight("AA201", Date.from(Instant.now()), Date.from(Instant.now()),Date.from(Instant.now()),Date.from(Instant.now()),"London Heathrow", "New York JFK", 2);
		checkIn.setFlight(flight2);
		assertEquals(flight2, checkIn.getFlight());
		assertThrows(NullPointerException.class, () -> {checkIn.setFlight(null);});
	}
	
	@Test
	public void testGetPassenger() {
		assertEquals(passenger, checkIn.getPassenger());
	}
	
	@Test
	public void testSetPassenger() {
		Passenger passenger2 = new Passenger("Michael", "Roomba");
		checkIn.setPassenger(passenger2);
		assertEquals(passenger2, checkIn.getPassenger());
		assertThrows(NullPointerException.class, () -> {checkIn.setPassenger(null);});
	}

}
