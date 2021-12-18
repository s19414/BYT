package main;

import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passenger {

	//constructor attributes
    private String firstName;
    private String lastName;
    private UUID passengerId;
    
    //association attributes
    private ArrayList<Luggage> luggages;
    private ArrayList<Ticket> tickets;
    
    //helper attributes
    private String nameRegex = "[a-zA-Z\\s]+";

    public Passenger(String firstName, String lastName) {
    	if(firstName == null) {
			throw new NullPointerException("First name cannot be null");
		}
		if(lastName == null) {
			throw new NullPointerException("Last name cannot be null");
		}
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher firstNameMatcher = pattern.matcher(firstName);
		Matcher lastNameMatcher = pattern.matcher(lastName);
		if(!firstNameMatcher.matches()) {
			throw new IllegalArgumentException(firstName + " is not a valid name");
		}
		if(!lastNameMatcher.matches()) {
			throw new IllegalArgumentException(lastName + " is not a valid name");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		passengerId = UUID.randomUUID();
        luggages = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
    	if(firstName == null) {
			throw new NullPointerException("First name cannot be null");
		}
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher firstNameMatcher = pattern.matcher(firstName);
		if(!firstNameMatcher.matches()) {
			throw new IllegalArgumentException(firstName + " is not a valid name");
		}
		this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
    	if(lastName == null) {
			throw new NullPointerException("Last name cannot be null");
		}
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher lastNameMatcher = pattern.matcher(lastName);
		if(!lastNameMatcher.matches()) {
			throw new IllegalArgumentException(lastName + " is not a valid name");
		}
		this.lastName = lastName;
    }

    public UUID getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(UUID passengerId) {
    	if(passengerId == null) {
    		throw new NullPointerException("Passenger id cannot be null");
    	}
        this.passengerId = passengerId;
    }
    
    public ArrayList<Luggage> getLuggages(){
    	ArrayList<Luggage> copyList = new ArrayList<>(luggages);
    	return copyList;
    }
    
    public void setLuggages(ArrayList<Luggage> luggages) {
    	if(luggages == null) {
    		throw new NullPointerException("Luggage cannot be null");
    	}
    	this.luggages = new ArrayList<>(luggages);
    }
    
    public ArrayList<Ticket> getTickets(){
    	ArrayList<Ticket> copyList = new ArrayList<>(tickets);
    	return copyList;
    }
    
    public void setTickets(ArrayList<Ticket> tickets) {
    	if(tickets == null) {
    		throw new NullPointerException("Tickets cannot be null");
    	}
    	this.tickets = new ArrayList<>(tickets);
    }
}
