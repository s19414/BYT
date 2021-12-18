package main;

import java.util.ArrayList;

public class Airline {
    public String name;
    public String address;
    private ArrayList<Airplane> airplaneList = new ArrayList<Airplane>();
    
    public Airline(String name, String address) {
    	if(name == null) {
    		throw new NullPointerException("Name is null");
    	}
    	if(address == null) {
    		throw new NullPointerException("Address is null");
    	}
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

	public ArrayList<Airplane> getAirplaneList() {
		return airplaneList;
	}

	public void setAirplaneList(ArrayList<Airplane> airplaneList) {
		this.airplaneList = airplaneList;
	}
}
