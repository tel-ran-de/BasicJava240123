package lessons.lesson2;

public class CarDemo {
    public static void main(String[] args) {

        Car mySuperCar = new Car();

        mySuperCar.model = "Mercedes G-class";
        mySuperCar.numbersOfWheel = 4;
        mySuperCar.isElectric = false;
        mySuperCar.distance = 25125.5;

        System.out.println("Parameters of my car is:");
        System.out.println("Model - " + mySuperCar.model);
        System.out.println("Number of wheels is - " + mySuperCar.numbersOfWheel);
        System.out.println("My car electric - " + mySuperCar.isElectric);
        System.out.println("Distance is " + mySuperCar.distance);

        Car myFriendCar = new Car();

        myFriendCar.model = " Tesla Type S";
        myFriendCar.numbersOfWheel = 4;
        myFriendCar.isElectric = true;
        myFriendCar.distance = 100.3;

        System.out.println("Parameters of my friends car is:");
        System.out.println("Model - " + myFriendCar.model);
        System.out.println("Number of wheels is - " + myFriendCar.numbersOfWheel);
        System.out.println("My car electric - " + myFriendCar.isElectric);
        System.out.println("Distance is " + myFriendCar.distance);

    }

}
