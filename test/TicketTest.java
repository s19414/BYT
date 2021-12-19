package test;

import main.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TicketTest {

	Ticket ticket;
	Flight flight;
	Airplane airplane;
	Airline airline;
	Passenger passenger;

	@Before
	public void setUp() {
		airline = new Airline("Finnair", "Finland");
		airplane = new Airplane("Boeing666", 444, 13, 1, 0, airline);
		flight = new Flight("FIN007",new Date(2000), new Date(2500),new Date(4000),new Date(20000),"London Heathrow", "New York JFK", 2,airplane);
		passenger = new Passenger("Mary", "Jane");
		ticket = new Ticket(Ticket.TicketClass.ECONOMY, 20, "Passport", 200.50, 20.0, 1, flight,passenger);
	}

	@Test
	public void testCheckInPassanger() {
		assertEquals("Passenger checked in", ticket.checkInPassanger());
	}

	@Test
	public void testGetClassOfTicket() {
		assertEquals(Ticket.TicketClass.ECONOMY, ticket.getClassOfTicket());
	}

	@Test
	public void testSetClassOfTicket() {
		ticket.setClassOfTicket(Ticket.TicketClass.BUSINESS);
		assertEquals(Ticket.TicketClass.BUSINESS, ticket.getClassOfTicket());
		assertThrows(NullPointerException.class, () -> {ticket.setClassOfTicket(null);});
	}

	@Test
	public void testGetSeatNummber() {
		assertEquals(20, ticket.getSeatNummber());
	}

	@Test
	public void testSetSeatNummber() {
		ticket.setSeatNummber(21);
		assertEquals(21, ticket.getSeatNummber());
	}

	@Test
	public void testGetTravelDocument() {
		assertEquals("Passport", ticket.getTravelDocument());
	}

	@Test
	public void testSetTravelDocument() {
		ticket.setTravelDocument("Id");
		assertEquals("Id", ticket.getTravelDocument());
		assertThrows(NullPointerException.class, () -> {ticket.setTravelDocument(null);});
	}

	@Test
	public void testGetPrice() {
		assertEquals(200.50, ticket.getPrice(),0);
	}

	@Test
	public void testSetPrice() {
		ticket.setPrice(210.2);
		assertEquals(210.2, ticket.getPrice(),0);
	}

	@Test
	public void testGetLuggagePenalty() {                                         //CHANGE_ERROR
		assertEquals(20.0, ticket.getLuggagePenalty(),0);
	}

	@Test
	public void testGetMaxLuggage() {
		assertEquals(1, ticket.getMaxLuggage(),0);
	}

	@Test
	public void testGetFlight() {
		assertEquals(flight, ticket.getFlight());
	}

	@Test
	public void testSetFlight() {
		Flight flight2 = new Flight("FIN009",new Date(2000), new Date(2500),new Date(4000),new Date(20000),"London Heathrow", "Brussel JFK", 2,airplane);
		ticket.setFlight(flight2);
		assertEquals(flight2, ticket.getFlight());
		assertThrows(NullPointerException.class, () -> {ticket.setFlight(null);});
	}

	@Test
	public void testGetPassenger() {
		assertEquals(passenger, ticket.getPassenger());
	}

	@Test
	public void testSetPassenger() {
		Passenger passenger2 = new Passenger("John", "Frod");
		ticket.setPassenger(passenger2);
		assertEquals(passenger2, ticket.getPassenger());
		assertThrows(NullPointerException.class, () -> {ticket.setPassenger(null);});
	}
}
