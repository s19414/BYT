package main;

public class Airplane {
    public String name;
    public int model;
    public int registrationId;
    public int sits;
    public int limitOfKg;

    public Airplane(String name, int model, int registrationId, int sits, int limitOfKg) {
        this.name = name;
        this.model = model;
        this.registrationId = registrationId;
        this.sits = sits;
        this.limitOfKg = limitOfKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }

    public int getLimitOfKg() {
        return limitOfKg;
    }

    public void setLimitOfKg(int limitOfKg) {
        this.limitOfKg = limitOfKg;
    }
}

