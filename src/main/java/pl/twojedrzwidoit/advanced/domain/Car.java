package pl.twojedrzwidoit.advanced.domain;

public class Car {

    String id;
    String imageUrl;
    String model;
    String range;
    String petrol;
    Boolean available;

    public Car(String id, String imageUrl, String model, String range, String petrol, Boolean available) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.model = model;
        this.range = range;
        this.petrol = petrol;
        this.available = available;
    }
}
