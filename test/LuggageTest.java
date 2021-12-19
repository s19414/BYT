package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

import main.Luggage;
import main.Passenger;

public class LuggageTest {
	
	Luggage luggage;
	Passenger passenger;
	Passenger passenger2;
	
	@Before
	public void setUp() {
		passenger = new Passenger("Herp", "Derp");
		passenger2 = new Passenger("Dorpy", "Dorp");
		luggage = new Luggage(1, Luggage.Category.HAND, 7, 5, passenger);
		
	}
	
	//test constructor exceptions
	@Test
	public void testConstructorCategoryNullException() {
		assertThrows(NullPointerException.class, () -> {new Luggage(2, null, 2, 2, passenger);});
	}

	@Test
	public void testConstructorPassengerNullException() {
		assertThrows(NullPointerException.class, () -> {new Luggage(2, Luggage.Category.HAND, 2, 2, null);});
	}
	
	//method tests
	@Test
	public void testGetIdLuggage() {
		assertEquals(1, luggage.getIdLuggage());
	}
	
	@Test
	public void testSetIdLuggage() {
		luggage.setIdLuggage(4);
		assertEquals(4, luggage.getIdLuggage());
	}
	
	@Test
	public void testGetCategory() {
		assertEquals(Luggage.Category.HAND, luggage.getCategory());
	}
	
	@Test
	public void testSetCategory() {
		luggage.setCategory(Luggage.Category.HOLD);
		assertEquals(Luggage.Category.HOLD, luggage.getCategory());
		assertThrows(NullPointerException.class, () -> {luggage.setCategory(null);});
	}
	
	@Test
	public void testGetWeight() {
		assertEquals(7, luggage.getWeight(), 0.0);
	}
	
	@Test
	public void testSetWeight() {
		luggage.setWeight(200);
		assertEquals(200, luggage.getWeight(), 0.0);
	}
	
	@Test
	public void testGetPrice() {
		assertEquals(5, luggage.getPrice(), 0.0);
	}
	
	@Test
	public void testSetPrice() {
		luggage.setPrice(80);
		assertEquals(80, luggage.getPrice(), 0.0);
	}
	
	@Test
	public void testGetPassenger() {
		assertEquals(passenger, luggage.getPassenger());
	}
	
	@Test
	public void testSetPassenger() {
		luggage.setPassenger(passenger2);
		assertEquals(passenger2, luggage.getPassenger());
	}
	
	@Test
	public void testSetPassengerException() {
		assertThrows(NullPointerException.class, () -> {luggage.setPassenger(null);});
	}
}














