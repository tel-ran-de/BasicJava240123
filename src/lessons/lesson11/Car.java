package lessons.lesson11;

public class Car {

    private Brand brand;
    private String model;

    private TypeOfVehicle modelType;

    private String color;

    private int speedLimit;

    public Car(Brand brand, String model, TypeOfVehicle modelType, String color, int speedLimit) {
        this.brand = brand;
        this.model = model;
        this.modelType = modelType;
        this.color = color;
        this.speedLimit = speedLimit;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public TypeOfVehicle getModelType() {
        return modelType;
    }

    public String getColor() {
        return color;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }
}
