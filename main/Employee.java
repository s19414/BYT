package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {	
	//constructor attributes
	protected String firstName;
	protected String lastName;	
	
	//helper attributes
	private String nameRegex = "[a-zA-Z\\s]+";
	
	public Employee(String firstName, String lastName) {
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
}
