package main;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
	//constructor attributes
	public String idFlight;
	public Date estimatedDateOfDeparture;
	public Date actualDateOfDeparture;
	public Date estimatedDateOfArrival;
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
	private double actualKgOnBoard;
	
	//temporary attributes
	private String flightInformation = "Some flight information";
	
	public Flight(String _idFlight, Date _estimatedDateOfDeparture,
			Date _actualDateOfDeparture, Date _estimatedDateOfArrival, Date _actualDateOfArrival, String _destinationFrom,
			String _destinationTo, int _limitPerHandLuggage, Airplane _airplane) {
		if(_idFlight == null) {
			throw new NullPointerException("Id of flight cannot be null");
		}
		idFlight = _idFlight;
		estimatedDateOfDeparture = _estimatedDateOfDeparture;
		actualDateOfDeparture = _actualDateOfDeparture;
		estimatedDateOfArrival = _estimatedDateOfArrival;
		actualDateOfArrival = _actualDateOfArrival;
		if(_destinationFrom == null) {
			throw new NullPointerException("DestinationFrom cannot be null");
		}
		destinationFrom = _destinationFrom;
		if(_destinationTo == null) {
			throw new NullPointerException("DestinationTo cannot be null");
		}
		destinationTo = _destinationTo;
		limitPerHandLuggage = _limitPerHandLuggage;
		if(_airplane == null) {
			throw new NullPointerException("Airplane cannot be null");
		}
		airplane = _airplane;
		calculateSoldSeats();
		calculateDelay();
		calculateKgOnBoard();
	}

	public String viewInformationAboutAllFlights() {
		return flightInformation;
	}
	
	public void updateInformationAboutAllFlights(String _flightInformation) {
		flightInformation = _flightInformation;
	}
	
	//getters and setters
	public String getIdFlight() {
		return idFlight;
	}	
	public void setIdFlight(String _idFlight) {
		if(_idFlight == null) {
			throw new NullPointerException("Id of flight cannot be null");
		}
		idFlight = _idFlight;
	}	
	public Date getEstimatedDateOfDeparture() {
		return estimatedDateOfDeparture;
	}
	public void setEstimatedDateOfDeparture(Date _estimatedDateOfDeparture) {
		estimatedDateOfDeparture = _estimatedDateOfDeparture;
	}
	public Date getActualDateOfDeparture() {
		return actualDateOfDeparture;
	}
	public void setActualDateOfDeparture(Date _actualDateOfDeparture) {
		actualDateOfDeparture = _actualDateOfDeparture;
	}
	public Date getEstimatedDateOfArrival() {
		return estimatedDateOfArrival;
	}
	public void setEstimatedDateOfArrival(Date _estimatedDateOfArrival) {
		estimatedDateOfArrival = _estimatedDateOfArrival;
	}
	public Date getActualDateOfArrival() {
		return actualDateOfArrival;
	}
	public void setActualDateOfArrival(Date _actualDateOfArrival) {
		actualDateOfArrival = _actualDateOfArrival;
	}
	public String getDestinationFrom() {
		return destinationFrom;
	}
	public void setDestinationFrom(String _destinationFrom) {
		if(_destinationFrom == null) {
			throw new NullPointerException("DestinationFrom cannot be null");
		}
		destinationFrom = _destinationFrom;
	}
	public String getDestinationTo() {
		return destinationTo;
	}
	public void setDestinationTo(String _destinationTo) {
		if(_destinationTo == null) {
			throw new NullPointerException("DestinationTo cannot be null");
		}
		destinationTo = _destinationTo;
	}
	public int getLimitPerHandLuggage() {
		return limitPerHandLuggage;
	}
	public void setLimitPerHandLuggage(int newLimit) {
		limitPerHandLuggage = newLimit;
	}
	public LocalTime getDelay() {
		return delay;
	}
	public int getSoldSeats() {
		return soldSeats;
	}
	public double getActualKgOnBoard() {
		return actualKgOnBoard;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane _airplane) {
		if(_airplane == null) {
			throw new NullPointerException("Airplane cannot be null");
		}
		airplane = _airplane;
	}
	public ArrayList<CheckIn> getCheckInList(){
		ArrayList<CheckIn> copyList = new ArrayList<>(checkInList);
		return copyList;
	}
	public void setCheckInList(ArrayList<CheckIn> newCheckIn) {
		if(newCheckIn == null) {
			throw new NullPointerException("Check in list cannot be null");
		}
		checkInList = new ArrayList<>(newCheckIn);
	}
	public ArrayList<Ticket> getTicketList(){
		ArrayList<Ticket> copyList = new ArrayList<>(ticketList);
		return copyList;
	}
	public void setTicketList(ArrayList<Ticket> newTicketList) {
		if(newTicketList == null) {
			throw new NullPointerException("Ticket list cannot be null");
		}
		ticketList = new ArrayList<>(newTicketList);
	}
	
	private void calculateDelay() {
		if(estimatedDateOfArrival != null && actualDateOfArrival != null) {
			long estimated = estimatedDateOfArrival.getTime();
			long actual = actualDateOfArrival.getTime();
			long delayValueInMiliseconds = actual - estimated;
			delay = LocalTime.ofSecondOfDay(delayValueInMiliseconds/1000);	
		}
		else {
			delay = LocalTime.now();
		}
	}

	private void calculateSoldSeats() {
		soldSeats = ticketList.size();
	}

	private void calculateKgOnBoard() {
		actualKgOnBoard = 0;
		for(Ticket ticket : ticketList) {
			ArrayList<Luggage> luggageList = ticket.getPassenger().getLuggages();
			for(Luggage luggage : luggageList) {
				actualKgOnBoard+=luggage.getWeight();
			}
		}
	}
}
