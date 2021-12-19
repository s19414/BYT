package test;

import main.Airline;
import main.Airplane;
import main.Flight;
import main.Luggage;
import main.Passenger;
import main.Ticket;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PassengerTest {

	Passenger passenger;
	Luggage luggage;
	Ticket ticket;
	Airline airline;
	Airplane airplane;
	Flight flight;
	UUID uuid;
	ArrayList<Luggage> luggageList;
	ArrayList<Ticket> ticketList;
	
	@Before
	public void setUp() {
		uuid = UUID.randomUUID();
		passenger = new Passenger("Paul","Bloom");
		luggage = new Luggage(25, Luggage.Category.HAND,18.3,38,passenger);
		airline = new Airline("Finnair", "Finland");
		airplane = new Airplane("Boeing666", 444, 13, 1, 0, airline);
		flight = new Flight("FIN007",new Date(2000), new Date(2500),new Date(4000),new Date(20000),"London Heathrow", "New York JFK", 2,airplane);
		ticket = new Ticket(Ticket.TicketClass.ECONOMY,36,"Passport",1200,0,2, flight, passenger);
		luggageList = new ArrayList<>();
		ticketList = new ArrayList<>();
		luggageList.add(luggage);
		ticketList.add(ticket);
		passenger.setLuggages(luggageList);
		passenger.setTickets(ticketList);
		passenger.setPassengerId(uuid);
	}

	@Test
	public void testGetFirstName(){
		assertEquals("Paul",passenger.getFirstName());
	}

	@Test
	public void testSetFirstName(){
		passenger.setFirstName("Paul");
		assertEquals("Paul",passenger.getFirstName());
		assertThrows(NullPointerException.class,()->{passenger.setFirstName(null);});
	}

	@Test
	public void testGetLastName(){
		assertEquals("Bloom",passenger.getLastName());
	}
	@Test
	public void testSetLastName(){
		passenger.setFirstName("Bloom");
		assertEquals("Bloom",passenger.getLastName());
		assertThrows(NullPointerException.class,()->{passenger.setLastName(null);});
	}

	@Test
	public void testGetPassengerId(){
		assertEquals(uuid,passenger.getPassengerId());
	}

	@Test
	public void testSetPassengerId(){
		UUID uuid2 = UUID.randomUUID();
		passenger.setPassengerId(uuid2);
		assertEquals(uuid2,passenger.getPassengerId());
		assertThrows(NullPointerException.class,()->{passenger.setPassengerId(null);});
	}

	@Test
	public void testGetLuggage(){
		assertEquals(luggageList,passenger.getLuggages());
	}

	@Test
	public void testSetLuggage(){
		ArrayList<Luggage> luggages = new ArrayList<>();
		luggages.add(luggage);
		passenger.setLuggages(luggages);
		assertEquals(luggages,passenger.getLuggages());
		assertThrows(NullPointerException.class,()->{passenger.setLuggages(null);});
	}

	@Test
	public void testGetTickets(){
		assertEquals(ticketList,passenger.getTickets());
	}

	@Test
	public void testSetTickets(){
		ArrayList<Ticket> tickets = new ArrayList<>();
		tickets.add(ticket);
		passenger.setTickets(tickets);
		assertEquals(tickets,passenger.getTickets());
		assertThrows(NullPointerException.class,()->{passenger.setTickets(null);});
	}

}
