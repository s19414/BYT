package main;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
	//constructor attributes
	public String idFlight;
	public Date estimatedDateOfDeparture;
	public Date actualDateOfDeparture;
	public Date actualDateOfArrival;
	public String destinationFrom;
	public String destinationTo;
	public int limitPerHandLuggage;
	
	//association attributes
	private Airplane airplane;
	private ArrayList<CheckIn> checkInList = new ArrayList<CheckIn>();
	private ArrayList<Ticket> ticketList = new ArrayList<Ticket>();

	//derived attributes
	public int soldSeats;
	private LocalTime delay = LocalTime.MIN;
	private double actualKgOnBoard = 0.0;
	
	//temporary attributes
	private String flightInformation = "don't crash lel";
	
	public Flight(String _idFlight, Date _estimatedDateOfDeparture,
			Date _actualDateOfDeparture, Date _actualDateOfArrival, String _destinationFrom,
			String _destinationTo, int _limitPerHandLuggage) {
		idFlight = _idFlight;
		estimatedDateOfDeparture = _estimatedDateOfDeparture;
		actualDateOfDeparture = _actualDateOfDeparture;
		actualDateOfArrival = _actualDateOfArrival;
		destinationFrom = _destinationFrom;
		destinationTo = _destinationTo;
		limitPerHandLuggage = _limitPerHandLuggage;
		//TODO derived properties
	}
	
	public String viewInformationAboutAllFlights() {
		return flightInformation;
	}
	
	public void updateInformationAboutAllFlights(String _flightInformation) {
		flightInformation = _flightInformation;
	}
	
	//getters and setters
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public ArrayList<CheckIn> getCheckInList() {
		return checkInList;
	}

	public void setCheckInList(ArrayList<CheckIn> checkInList) {
		this.checkInList = checkInList;
		//update actualKgOnBoard as passengers check in
		actualKgOnBoard = 0;
		for (CheckIn checkIn : checkInList) {
			actualKgOnBoard += checkIn.getHandLuggageWeight();
		}
	}

	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
		soldSeats = ticketList.size();
	}

	public LocalTime getDelay() {
		return delay;
	}

	public void setDelay(LocalTime delay) {
		this.delay = delay;
	}

	public double getActualKgOnBoard() {
		return actualKgOnBoard;
	}
	
}
