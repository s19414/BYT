package test;

import main.Luggage;
import main.Passenger;
import main.Ticket;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

	Passenger passenger;
	Luggage luggage;
	Ticket ticket;
	ArrayList<Luggage> luggageList;
	ArrayList<Ticket> ticketList;
	
	@Before
	public void setUp() {
		passenger = new Passenger("Paul","Bloom");
		luggage = new Luggage(25, Luggage.Category.HAND,18.3,38,passenger);
		ticket = new Ticket(Ticket.TicketClass.ECONOMY,36,"Passport",1200,0,2, ticket.getFlight(), passenger);
		luggageList.add(luggage);
		ticketList.add(ticket);

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
		assertEquals(passenger,passenger.getPassengerId());
	}

	@Test
	public void testSetPassengerId(){
		UUID uuid = UUID.randomUUID();
		passenger.setPassengerId(uuid);
		assertEquals(uuid,passenger.getPassengerId());
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
		assertThrows(NullPointerException.class,()->{passenger.setLuggages(luggages);});
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
		assertThrows(NullPointerException.class,()->{passenger.setTickets(tickets);});
	}

}
