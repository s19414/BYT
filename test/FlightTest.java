package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import main.Airline;
import main.Airplane;
import main.CheckIn;
import main.Flight;
import main.Luggage;
import main.Passenger;
import main.Ticket;

public class FlightTest {
	
	Flight flight;
	Airplane airplane;
	Airline airline;
	Passenger passenger;
	ArrayList<Ticket> ticketList;
	ArrayList<CheckIn> checkInList;
	
	@Before
	public void setUp() {
		airline = new Airline("Finnair", "Finland");
		airplane = new Airplane("Boeing666", 444, 13, 1, 0, airline);
		flight = new Flight("FIN007",new Date(2000), new Date(2500),new Date(4000),new Date(20000),"London Heathrow", "New York JFK", 2,airplane);
		passenger = new Passenger("Mary", "Jane");
		Luggage luggage1 = new Luggage(1,Luggage.Category.HAND, 70, 2, passenger);
		ArrayList<Luggage> luggageList = new ArrayList<>();
		luggageList.add(luggage1);
		passenger.setLuggages(luggageList);
		Ticket ticket = new Ticket(Ticket.TicketClass.ECONOMY, 20, "Passport", 200.50, 20.0, 1, flight,passenger);
		ticketList = new ArrayList<>();
		ticketList.add(ticket);
		CheckIn checkIn = new CheckIn(new Date(5000), flight, passenger);
		checkInList = new ArrayList<>();
		checkInList.add(checkIn);
		flight.setTicketList(ticketList);
		flight.setCheckInList(checkInList);
	}
	
	@Test
	public void testGetIdFlight() {
		assertEquals("FIN007", flight.getIdFlight());
	}
	
	@Test
	public void testSetIdFlight() {
		flight.setIdFlight("FIN243");
		assertEquals("FIN243", flight.getIdFlight());
		assertThrows(NullPointerException.class, () -> {flight.setIdFlight(null);});
	}
	
	@Test
	public void testGetEstimatedDateOfDeparture() {
		assertEquals(2000, flight.getEstimatedDateOfDeparture().getTime());
	}
	
	@Test
	public void testSetEstimatedDateOfDeparture() {
		flight.setEstimatedDateOfDeparture(new Date(3000));
		assertEquals(3000, flight.getEstimatedDateOfDeparture().getTime());
	}
	
	@Test
	public void testGetActualDateOfDeparture() {
		assertEquals(2500, flight.getActualDateOfDeparture().getTime());
	}
	
	@Test
	public void testSetActualDateOfDeparture() {
		flight.setActualDateOfDeparture(new Date(3500));
		assertEquals(3500, flight.getActualDateOfDeparture().getTime());
	}
	
	@Test
	public void testGetEstimatedDateOfArrival() {
		assertEquals(4000, flight.getEstimatedDateOfArrival().getTime());
	}
	
	@Test
	public void testSetEstimatedDateOfArrival() {
		flight.setEstimatedDateOfArrival(new Date(5000));
		assertEquals(5000, flight.getEstimatedDateOfArrival().getTime());
	}
	
	@Test
	public void testGetActualDateOfArrival() {
		assertEquals(20000, flight.getActualDateOfArrival().getTime());
	}
	
	@Test
	public void testSetActualDateOfArrival() {
		flight.setActualDateOfArrival(new Date(5500));
		assertEquals(5500, flight.getActualDateOfArrival().getTime());
	}
	
	@Test
	public void testGetDestinationFrom() {
		assertEquals("London Heathrow", flight.getDestinationFrom());
	}
	
	@Test
	public void testSetDestinationFrom() {
		flight.setDestinationFrom("Warsaw Chopin");
		assertEquals("Warsaw Chopin", flight.getDestinationFrom());
		assertThrows(NullPointerException.class, () -> {flight.setDestinationFrom(null);});
	}
	
	@Test
	public void testGetDestinationTo() {
		assertEquals("New York JFK", flight.getDestinationTo());
	}
	
	@Test
	public void testSetDestinationTo() {
		flight.setDestinationTo("Chicago O'Hare");
		assertEquals("Chicago O'Hare", flight.getDestinationTo());	
		assertThrows(NullPointerException.class, () -> {flight.setDestinationTo(null);});
	}
	
	@Test
	public void testGetLimitPerHandLuggage() {
		assertEquals(2, flight.getLimitPerHandLuggage());
	}
	
	@Test
	public void testSetLimitPerHandLuggage() {
		flight.setLimitPerHandLuggage(10);
		assertEquals(10, flight.getLimitPerHandLuggage());
	}
	
	@Test
	public void testGetDelay() {
		assertEquals(16, flight.getDelay().toSecondOfDay());
	}
	
	@Test
	public void testGetSoldSeats() {
		assertEquals(1, flight.getSoldSeats());
	}
	
	@Test
	public void testGetActualKgOnBoard() {
		assertEquals(70, flight.getActualKgOnBoard(),0);
	}
	
	@Test
	public void testGetAirplane() {
		assertEquals(airplane, flight.getAirplane());
	}
	
	@Test
	public void testSetAirplane() {
		Airplane airplane2 = new Airplane("Airbus A320",200,1,200, 1000, airline);
		flight.setAirplane(airplane2);
		assertEquals(airplane2, flight.getAirplane());
		assertThrows(NullPointerException.class, () -> {flight.setAirplane(null);});
	}
	
	@Test
	public void testGetCheckInList() {
		assertEquals(checkInList, flight.getCheckInList());
	}
	
	@Test
	public void testSetCheckInList() {
		CheckIn checkIn = new CheckIn(new Date(10000), flight, passenger);
		ArrayList<CheckIn> checkIns = new ArrayList<>();
		checkIns.add(checkIn);
		flight.setCheckInList(checkIns);
		assertEquals(checkIns, flight.getCheckInList());
		assertThrows(NullPointerException.class, () -> {flight.setCheckInList(null);});
	}
	
	@Test
	public void testGetTicketList() {
		assertEquals(ticketList, flight.getTicketList());
	}
	
	@Test
	public void testSetTicketList() {
		Ticket ticket = new Ticket(Ticket.TicketClass.FIRST, 20, "Passport", 200.50, 20.0, 1, flight,passenger);
		ArrayList<Ticket> tickets = new ArrayList<>();
		tickets.add(ticket);
		flight.setTicketList(tickets);
		assertEquals(tickets, flight.getTicketList());
		assertThrows(NullPointerException.class, () -> {flight.setTicketList(null);});
	}

}
