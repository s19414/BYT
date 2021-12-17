package main;

public class Luggage {

    private int idLuggage;;
    private String category;
    private double weight;
    public double price;

    public Luggage(int idLuggage, String category, double weight, double price) {
        this.idLuggage = idLuggage;
        this.category = category;
        this.weight = weight;
        this.price = price;
    }

    public int getIdLuggage() {
        return idLuggage;
    }

    public void setIdLuggage(int idLuggage) {
        this.idLuggage = idLuggage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
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

}
