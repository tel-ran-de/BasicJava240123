package lessons.lesson11;

public class Car {

    private Brand brand;
    private String model;

    TypeOfVehicle modelType;

    String color;

    int speedLimit;

    public Car(Brand brand, String model, TypeOfVehicle modelType, String color, int speedLimit) {
        this.brand = brand;
        this.model = model;
        this.modelType = modelType;
        this.color = color;
        this.speedLimit = speedLimit;
    }
}
