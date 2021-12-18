package main;

public class AirportWorker extends Employee{

    public AirportWorker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String flagAnIssue(){
        return "Issue has been flagged";
    }
}
