package lessons.lesson11;

import java.util.Arrays;

public class CarCollection {

    Car[] ourCollection;

    public void ourCollectionCreate(int collectionSize){
        // мы могли бы создать экземпляр класса GarageUtil прямо здесь
        // вызвать метод из которого мы бы получили значение arraySize
        //и создали бы наш массив на основании этих данных
        // тогда нам бы не нужно было ничего передавать в качестве параметра в этот метод

        ourCollection = new Car[collectionSize];
    }


    public void fillOurCollection(){
        for (int i = 0; i < ourCollection.length; i++) {
            ourCollection[i] = createNewCar();
        }

        System.out.println(Arrays.toString(ourCollection));
    }

    public void addCarToCollection(){

//        Car newCarForAdd = createNewCar();
//        //System.out.println(ourCollection.length);
//        System.out.println(ourCollection);
//        System.out.println(Arrays.toString(ourCollection));
//        for (int i = 0; i < ourCollection.length; i++) {
//            if (ourCollection[i] == null) {
//                ourCollection[i] = newCarForAdd;
//                break;
//            }
//        }
        System.out.println(Arrays.toString(ourCollection));

    }


    public Car createNewCar(){
        Brand[] brandArray = {new Brand("Mercedes"), new Brand("BMW"),
                new Brand("Volvo"), new Brand("Toyota"), new Brand( "Ford")};
        int newBrandIndex = (int) (Math.random()*5);

        String[] modelArray = {"model1", "model2", "model3", "model4", "model5"};
        String newModel = modelArray[(int) (Math.random()*5)];

        String[] typeArray = {"sedan", "cabrio", "h-back", "cupe", "truck"};
        String newType = typeArray[(int) (Math.random()*5)];

        String[] colorArray = {"black", "white", "red", "blue", "green"};
        String newColor = colorArray[(int) (Math.random()*5)];

        int newSpeedLimit = 120;

        Car newCar = new Car(brandArray[newBrandIndex],newModel,new TypeOfVehicle(newType),newColor, newSpeedLimit);

        return newCar;
    }


    void printCarCollectionData(){
        for (int i = 0; i < ourCollection.length; i++) {
            printData(i, ourCollection[i]);
        }
    }

    public void printData(int index, Car carForPrinting){
        System.out.println("=======================");
        System.out.println("Car " + index + " data");
        System.out.println("Brand - " + carForPrinting.getBrand());
        System.out.println("Model - " + carForPrinting.getModel());
        System.out.println("Type - " + carForPrinting.getModelType());
        System.out.println("Color - " + carForPrinting.getColor());
        System.out.println("Speed - " + carForPrinting.getSpeedLimit());

    }

}
