package lessons.lesson11.logica;

import lessons.lesson11.entity.Brand;
import lessons.lesson11.entity.Car;
import lessons.lesson11.entity.TypeOfVehicle;

import java.util.Arrays;

public class CarCollection {

    private Car[] ourCollection;
    Brand[] brandArray = {new Brand("Mercedes"),
            new Brand("BMW"),
            new Brand("Volvo"),
            new Brand("Toyota"),
            new Brand( "Ford")};
    String[] modelArray = {"model1", "model2", "model3", "model4", "model5"};

    TypeOfVehicle[] typeArray = {new TypeOfVehicle("sedan"),
            new TypeOfVehicle("cabrio"),
            new TypeOfVehicle("h-back"),
            new TypeOfVehicle("cupe"),
            new TypeOfVehicle("truck")};

    String[] colorArray = {"black", "white", "red", "blue", "green"};


    public void ourCollectionCreate(int collectionSize){
        // мы могли бы создать экземпляр класса GarageUtil прямо здесь
        // вызвать метод из которого мы бы получили значение arraySize
        //и создали бы наш массив на основании этих данных
        // тогда нам бы не нужно было ничего передавать в качестве параметра в этот метод

        ourCollection = new Car[collectionSize];
    }


    public void fillOurCollection(){
        for (int i = 0; i < ourCollection.length; i++) {
            ourCollection[i] = createNewCar(getRandomBrand(),getRandomModel(),getRandomType(),getRandomColor());
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


    public Car createNewCar(Brand newCarBrand, String newCarModel, TypeOfVehicle newCarType, String newCarColor){

        int newSpeedLimit = 120;

        Car newCar = new Car(newCarBrand,newCarModel,newCarType,newCarColor, newSpeedLimit);

        return newCar;
    }


    public void printCarCollectionData(){
        for (int i = 0; i < ourCollection.length; i++) {
            printData(i, ourCollection[i]);
        }
    }

    public void printData(int index, Car carForPrinting){
        System.out.println("=======================");
        System.out.println("Car " + index + " data");
        System.out.println("Brand - " + carForPrinting.getBrand());
        System.out.println("Brand - " + carForPrinting.getBrand().getBrandName());

        System.out.println("Model - " + carForPrinting.getModel());
        System.out.println("Type - " + carForPrinting.getModelType());
        System.out.println("Type - " + carForPrinting.getModelType().getGeneralType());
        System.out.println("Color - " + carForPrinting.getColor());
        System.out.println("Speed - " + carForPrinting.getSpeedLimit());

    }

    public Car[] getOurCollection() {
        return ourCollection;
    }

    public Brand getRandomBrand(){
        Brand brandForReturn = brandArray[(int) (Math.random()*5)];
        return brandForReturn;
    }

    public String getRandomModel(){
        String modelForReturn =  modelArray[(int) (Math.random()*5)];
        return modelForReturn;
    }

    public TypeOfVehicle getRandomType(){
        TypeOfVehicle typeForReturn = typeArray[(int) (Math.random()*5)];
        return typeForReturn;
    }

    public String getRandomColor(){
        String colorForReturn =  colorArray[(int) (Math.random()*5)];
        return colorForReturn;
    }
}
