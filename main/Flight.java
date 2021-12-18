package main;

import java.time.LocalTime;
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
	
	//derived attributes
	public int soldSeats;
	public LocalTime delay;
	public double actualKgOnBoard;
	
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
	
	public void viewInformationAboutAllFlights() {	
	}
	
	public void updateInformationAboutAllFlights() {	
	}
}
