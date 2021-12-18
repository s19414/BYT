package main;

public class Luggage {
	enum Category{
		HAND,
		HOLD
	}
	//constructor attributes
    private int idLuggage;
    private Category category;
    private double weight;
    private double price;
    
    //association attributes
    private Passenger passenger;

    public Luggage(int idLuggage, Category category, double weight, double price, Passenger passenger) {
        this.idLuggage = idLuggage;
        if(category == null) {
        	throw new NullPointerException("Category cannot be null");
        }
        this.category = category;
        this.weight = weight;
        this.price = price;
        if(passenger == null) {
        	throw new NullPointerException("Passenger cannot be null");
        }
        this.passenger = passenger;
    }

    public int getIdLuggage() {
        return idLuggage;
    }

    public void setIdLuggage(int idLuggage) {
        this.idLuggage = idLuggage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
    	if(category == null) {
    		throw new NullPointerException("Category cannot be null");
    	}
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Passenger getPassenger() {
    	return passenger;
    }
    
    public void setPassenger(Passenger passenger) {
    	if(passenger == null) {
        	throw new NullPointerException("Passenger cannot be null");
        }
    	this.passenger = passenger;
    }

}
