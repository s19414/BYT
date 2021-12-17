package main;

public class Airline {
  public String name;
  public String address;
  
  public AirPlane(String name, String address){
        this.name=name;
        this.address = address;
    } 
  
  public String getname() {
        return name;
    }

   public String getAddress() {
        return address;
    }

}
