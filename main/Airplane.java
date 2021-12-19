package main;

import java.util.ArrayList;

public class Airplane {
    public String name;
    public int model;
    public int registrationId;
    public int seats;
    public int limitOfKg;

    //association properties
    private Airline airline;
    private ArrayList<Flight> flightList;
    
    public Airplane(String name, int model, int registrationId, int seats, int limitOfKg, Airline _airline) {
        if(name == null) {
        	throw new NullPointerException("Name cannot be null");
        }
    	this.name = name;
        this.model = model;
        this.registrationId = registrationId;
        this.seats = seats;
        this.limitOfKg = limitOfKg;
        if(_airline == null) {
        	throw new NullPointerException("Airline cannot be null");
        }
        this.setAirline(_airline);
        flightList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    	if(name == null) {
        	throw new NullPointerException("Name cannot be null");
        }
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getLimitOfKg() {
        return limitOfKg;
    }

    public void setLimitOfKg(int limitOfKg) {
        this.limitOfKg = limitOfKg;
    }
    
    public String addFlight(){
        return "a Flight is added";
    }
    
     @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", registrationId=" + registrationId +
                ", sits=" + seats +
                ", limitOfKg=" + limitOfKg +
                '}';
    }

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		if(airline == null) {
			throw new NullPointerException("Airline cannot be null");
		}
		this.airline = airline;
	}
	
	public ArrayList<Flight> getFlightList(){
		ArrayList<Flight> copyList = new ArrayList<>(flightList);
		return copyList;
	}
	
	public void setFlightList(ArrayList<Flight> flightList) {
		if(flightList == null) {
			throw new NullPointerException("Flight list cannot be null");
		}
		this.flightList = new ArrayList<>(flightList);
	}
}

