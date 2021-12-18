package main;

import java.util.ArrayList;

public class Ticket {
	enum Class{
		ECONOMY,
		BUSINESS,
		FIRST
	}
	//constructor attributes
    private Class _class;
    private int seatNummber;
    private String travelDocument;
    private double price;
    private int maxLuggage;
    
    //derived attributes
    private double luggagePenalty;
    
    //association attributes
    private Flight flight;
    private Passenger passenger;

    public Ticket(Class _class, int seatNummber, String travelDocument, double price, double luggagePenalty, int maxLuggage, Flight flight, Passenger passenger) {
        if(_class == null) {
        	throw new NullPointerException("Class cannot be null");
        }
    	this.seatNummber = seatNummber;
    	if(travelDocument == null || travelDocument.equals("")) {
    		throw new NullPointerException("Travel document cannot be null");
    	}
        this.travelDocument = travelDocument;
        this.price = price;
        this.maxLuggage = maxLuggage;
        calculateLuggagePenalty();
        if(flight == null) {
        	throw new NullPointerException("Flight cannot be null");
        }
        this.flight = flight;
        if(passenger == null) {
        	throw new NullPointerException("Passenger cannot be null");
        }
        this.passenger = passenger;
    }

    public String checkInPassanger(){
        return "Passenger checked in";
    }
    
    public Class getClassOfTicket() {
    	return _class;
    }
    
    public void setClassOfTicket(Class _class) {
    	if(_class == null) {
    		throw new NullPointerException("Class cannot be null");
    	}
    	this._class = _class;
    }

    public int getSeatNummber() {
        return seatNummber;
    }

    public void setSeatNummber(int seatNummber) {
        this.seatNummber = seatNummber;
    }

    public String getTravelDocument() {
        return travelDocument;
    }

    public void setTravelDocument(String travelDocument) {
    	if(travelDocument == null || travelDocument.equals("")) {
    		throw new NullPointerException("Travel document cannot be null");
    	}
        this.travelDocument = travelDocument;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLuggagePenalty() {
        return luggagePenalty;
    }

    public int getMaxLuggage() {
        return maxLuggage;
    }

    public void setMaxLuggage(int maxLuggage) {
        this.maxLuggage = maxLuggage;
        calculateLuggagePenalty();
    }
    
    public Flight getFlight() {
    	return flight;
    }
    
    public void setFlight(Flight flight) {
    	 if(flight == null) {
    		 throw new NullPointerException("Flight cannot be null");
         }
         this.flight = flight;
    }
    
    public Passenger getPassenger() {
    	return passenger;
    }
    
    public void setPassenger(Passenger passenger) {
        if(passenger == null) {
        	throw new NullPointerException("Passenger cannot be null");
        }
        this.passenger = passenger;
        calculateLuggagePenalty();
    	
    }
    //helper method
    private void calculateLuggagePenalty() {
		luggagePenalty = 0;
		ArrayList<Luggage> luggageList = passenger.getLuggages();
		int size = luggageList.size();
		if(size > maxLuggage) {
			for(int i = size - 1; i >= maxLuggage; i++) {
				Luggage luggage = luggageList.get(i);
				luggagePenalty+=luggage.getWeight()*10;
			}
		}
	}
}
