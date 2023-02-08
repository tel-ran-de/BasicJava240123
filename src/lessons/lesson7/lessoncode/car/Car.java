package lessons.lesson7.lessoncode.car;



public class Car {

    Manufacturer manufacturer;
    String model;

    String typeOfBody;

    CarColors carColors;

    private int speedLimit;

    public Car(Manufacturer manufacturer, String model, String typeOfBody, CarColors carColors, int speedLimit) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.typeOfBody = typeOfBody;
        this.carColors = carColors;
        this.speedLimit = speedLimit;
    }

    void beep(){
        System.out.println("Beeeeeeep!!!!!");
    }

    void driverSay(String message) {
        System.out.println(message);
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }
}
