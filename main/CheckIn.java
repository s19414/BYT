package main;

import java.util.ArrayList;
import java.util.Date;

public class CheckIn {
	
	private Date date;
	private Flight flight;
	private Passenger passenger;
	private double handLuggageWeight;
	
	public CheckIn(Date date, Flight flight, Passenger passenger) {
		if(date == null) {
			throw new NullPointerException("Date cannot be null");
		}
		if(flight == null) {
			throw new NullPointerException("Flight cannot be null");
		}
		if(passenger == null) {
			throw new NullPointerException("Passenger cannot be null");
		}
		this.date = date;
		this.flight = flight;
		this.passenger = passenger;
		calculateHandLuggageWeight();
	}
	
	private void calculateHandLuggageWeight() {
		handLuggageWeight = 0;
		ArrayList<Luggage> luggageList = passenger.getLuggage();
		int size = luggageList.size();
		for(Luggage luggage : luggageList) {
			if(luggage.getCategory().equals("hand")) {
				handLuggageWeight+=luggage.getWeight();
			}
		}			
	}

	public Date getDate() {
		return date;
	}
	
	public Flight getFlight() {
		return flight;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}

	public void setDate(Date date) {
		if(date == null) {
			throw new NullPointerException("Date cannot be null");
		}
		this.date = date;
	}

	public void setFlight(Flight flight) {
		if(flight == null) {
			throw new NullPointerException("Flight cannot be null");
		}
		this.flight = flight;
	}

	public void setPassenger(Passenger passenger) {
		if(passenger == null) {
			throw new NullPointerException("Passenger cannot be null");
		}
		this.passenger = passenger;
	}

}
