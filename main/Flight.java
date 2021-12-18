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
	

	//derived attributes
	public int soldSeats;
	public LocalTime delay;
	public double actualKgOnBoard;
	
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
	
	public void addCheckIn(CheckIn checkIn) {
		checkInList.add(checkIn);
	}
	
	public ArrayList<CheckIn> getCheckIns() {
		return new ArrayList<CheckIn>(checkInList);
	}
}
