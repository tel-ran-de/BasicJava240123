package lessons.lesson7.lessoncode.car;

public class CarDemo {
    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Mercedes", 2023); // создаем экземпляр класса
        // с помощью конструктора мы передаем начальное значение для поля manufacturer

        System.out.println("Ссылка на экземпляр класса Manufacturer - " + manufacturer);
        System.out.println("Значение 1 поля в экземпляре класса Manufacturer - " + manufacturer.manufacturerFullName);
        System.out.println("Значение 2 поля в экземпляре класса Manufacturer - " + manufacturer.year);
        System.out.println("-----------");

        Manufacturer manufacturer2 = new Manufacturer("BMW", 2022); // создаем экземпляр класса
        // с помощью конструктора мы передаем начальное значение для поля manufacturer

        System.out.println("Ссылка на экземпляр класса Manufacturer2 - " + manufacturer2);
        System.out.println("Значение 1 поля в экземпляре класса Manufacturer - " + manufacturer2.manufacturerFullName);
        System.out.println("Значение 2 поля в экземпляре класса Manufacturer - " + manufacturer2.year);
        System.out.println("-----------");

        Manufacturer manufacturer3 = new Manufacturer("Mercedes new", 2023); // создаем экземпляр класса
        // с помощью конструктора мы передаем начальное значение для поля manufacturer

        System.out.println("Ссылка на экземпляр класса Manufacturer - " + manufacturer3);
        System.out.println("Значение 1 поля в экземпляре класса Manufacturer - " + manufacturer3.manufacturerFullName);
        System.out.println("Значение 2 поля в экземпляре класса Manufacturer - " + manufacturer3.year);
        System.out.println("-----------");

        System.out.println("Change link on example class!!!!");

        manufacturer3 = manufacturer2;
        System.out.println("Ссылка на экземпляр класса Manufacturer - " + manufacturer3);
        System.out.println("Значение 1 поля в экземпляре класса Manufacturer - " + manufacturer3.manufacturerFullName);
        System.out.println("Значение 2 поля в экземпляре класса Manufacturer - " + manufacturer3.year);
        System.out.println("-----------");





        System.out.println("-----------");

        CarColors color1 = new CarColors("Black metallic");

        System.out.println("Ссылка на экземпляр класса CarColors - " + color1);
        System.out.println("Значение поля в экземпляре класса CarColors - " + color1.color);



        Car newCar = new Car(manufacturer,"GL350D", "SUV",color1,100);

        System.out.println();

        System.out.println();

        System.out.println("================================================");

        System.out.println(newCar);
        System.out.println("New car manufacturer - " + newCar.manufacturer);
        System.out.println("New car model - " + newCar.model);
        System.out.println("New car type of body - " + newCar.typeOfBody);
        System.out.println("New car car colors - " + newCar.carColors);
        System.out.println("New car speed limit - " + newCar.getSpeedLimit());

        System.out.println("New car manufacturer name - " + newCar.manufacturer.manufacturerFullName);
        System.out.println("New car manufacturer year- " + newCar.manufacturer.year);
        System.out.println("New car car colors details - " + newCar.carColors.color);


        System.out.println("================================================");

        Car newCarBMW = new Car(manufacturer2,"740L", "sedan",color1,120);

        System.out.println();

        System.out.println();
        System.out.println(newCarBMW);
        System.out.println("New car manufacturer - " + newCarBMW.manufacturer);
        System.out.println("New car model - " + newCarBMW.model);
        System.out.println("New car type of body - " + newCarBMW.typeOfBody);
        System.out.println("New car car colors - " + newCarBMW.carColors);
        System.out.println("New car speed limit - " + newCarBMW.getSpeedLimit());

        System.out.println("New car manufacturer name - " + newCarBMW.manufacturer.manufacturerFullName);
        System.out.println("New car manufacturer year- " + newCarBMW.manufacturer.year);
        System.out.println("New car car colors details - " + newCarBMW.carColors.color);

//================================================================

        newCar.setSpeedLimit(250);
        System.out.println("Mercedes new  speed limit - " + newCar.getSpeedLimit());
        newCarBMW.setSpeedLimit(300);
        System.out.println("BMW new speed limit - " + newCarBMW.getSpeedLimit());

    }
}
