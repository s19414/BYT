package main;

public class Ticket {

    private int seatNummber;
    private String travelDocument;
    private double price;
    private double luggagePenalty;
    private int maxLuggage;

    public Ticket(int seatNummber, String travelDocument, double price, double luggagePenalty, int maxLuggage) {
        this.seatNummber = seatNummber;
        this.travelDocument = travelDocument;
        this.price = price;
        this.luggagePenalty = luggagePenalty;
        this.maxLuggage = maxLuggage;
    }

    private String checkInPassanger(){
        return "Passenger checked in";
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

    public void setLuggagePenalty(double luggagePenalty) {
        this.luggagePenalty = luggagePenalty;
    }

    public int getMaxLuggage() {
        return maxLuggage;
    }

    public void setMaxLuggage(int maxLuggage) {
        this.maxLuggage = maxLuggage;
    }
}
