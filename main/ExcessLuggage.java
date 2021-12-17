package main;

import java.util.ArrayList;

public class ExcessLuggage {
	
	private Passenger passenger;
	private Ticket ticket;
	private double price;
	
	public ExcessLuggage(Passenger passenger, Ticket ticket) {
		if(passenger == null) {
			throw new NullPointerException("Passenger cannot be null");
		}
		if(ticket == null) {
			throw new NullPointerException("Ticket cannot be null");
		}
		this.passenger = passenger;
		this.ticket = ticket;
		calculatePrice();
	}

	private void calculatePrice() {
		price = 0;
		ArrayList<Luggage> luggageList = passenger.getLuggage();
		int size = luggageList.size();
		if(size > ticket.getMaximumLuggage()) {
			for(int i = size - 1; i >= ticket.getMaximumLuggage(); i++) {
				Luggage luggage = luggageList.get(i);
				price+=luggage.getWeight()*10;
			}
		}
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public double getPrice() {
		return price;
	}

}
