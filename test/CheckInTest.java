package test;

import static org.junit.Assert.assertEquals;

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
	Flight flight;
	Passenger passenger;
	ArrayList<Luggage> luggageList;
	Luggage luggage1;
	@Before
	public void setUp() {
		luggageList = new ArrayList<Luggage>();
		passenger = new Passenger("Herp", "Derp");
		luggage1 = new Luggage(1,Luggage.Category.HOLD, 70, 2, passenger);
		luggageList.add(luggage1);
		flight = new Flight("flight", new Date(123456), new Date(2000000),
				new Date(4000000), "Elona Gay", "Hiroshima", 2);
		
		checkIn = new CheckIn(new Date(12345), flight, passenger);
		passenger.setLuggages(luggageList);
	}
	
	@Test
	public void testGetDate(){
		assertEquals(12345, checkIn.getDate().getTime());
	}
	
	@Test
	public void testGetHandLuggageWeight() {
		assertEquals(70, checkIn.getHandLuggageWeight(), 0);
	}
	

}
