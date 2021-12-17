package main;

import java.util.UUID;

public class Passenger {

    private String firstName;
    private String lastName;
    private UUID passengerId = UUID.randomUUID();

    public Passenger(String firstName, String lastName, UUID passengerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passengerId = passengerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UUID getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(UUID passengerId) {
        this.passengerId = passengerId;
    }
}
