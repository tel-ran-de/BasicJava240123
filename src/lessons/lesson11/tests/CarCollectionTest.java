package lessons.lesson11.tests;

import lessons.lesson11.entity.Brand;
import lessons.lesson11.entity.Car;
import lessons.lesson11.entity.TypeOfVehicle;
import lessons.lesson11.logica.CarCollection;

import java.util.Objects;

public class CarCollectionTest {
    public static void main(String[] args) {
        CarCollection carCollection = new CarCollection();

       //---- TEST1 create -----


        int testArraySize = 10;
        Car[] expectedResult = new Car[testArraySize];

        carCollection.ourCollectionCreate(testArraySize);

        if (expectedResult.length == carCollection.getOurCollection().length){
            System.out.println("Test 1 for create array is OK!");
        } else {
            System.out.println("Test 1 for create array is FAIL!");
            System.out.println("Expected result " + expectedResult.length +
                    " but received " + carCollection.getOurCollection().length);
        }


        //-------- TEST 2 car create -----

        // createNewCar(Brand newCarBrand, String newCarModel, TypeOfVehicle newCarType, String newCarColor)

        Brand newCarBrand = new Brand("FIAT");
        String newCarModel = "supoerModel";
        TypeOfVehicle newCarType = new TypeOfVehicle("speedCar");
        String newCarColor = "blue metallic";

        Car expectedCar = new Car(newCarBrand,newCarModel,newCarType,newCarColor,120);
        Car actualCar = carCollection.createNewCar(newCarBrand,newCarModel,newCarType,newCarColor);

        boolean checkCarBrandName = (expectedCar.getBrand().getBrandName().equals(actualCar.getBrand().getBrandName()));
        boolean checkCarModel = (expectedCar.getModel().equals(actualCar.getModel()));
        boolean checkCarType = (expectedCar.getModelType().getGeneralType().equals(actualCar.getModelType().getGeneralType()));
        boolean checkCarColor = (expectedCar.getColor().equals(actualCar.getColor()));
        boolean checkCarSpeed = expectedCar.getSpeedLimit() == actualCar.getSpeedLimit();


        if (checkCarBrandName && checkCarModel && checkCarType && checkCarColor && checkCarSpeed) {
            System.out.println("Test 2 for create new car is OK!");
        } else {
            System.out.println("Test 2 for create new car is FAIL!");
            System.out.println("Received brand result " +  checkCarBrandName );
            System.out.println("Received model result " +  checkCarModel );
            System.out.println("Received type result " +  checkCarType );
            System.out.println("Received color result " +  checkCarColor );
            System.out.println("Received speed result " +  checkCarSpeed );
        }





    }
}
