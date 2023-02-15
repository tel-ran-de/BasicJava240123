package lessons.lesson11;

import lessons.lesson11.logica.CarCollection;
import lessons.lesson11.services.GarageUtil;

public class AppCollection {
    public static void main(String[] args) {
        CarCollection garage = new CarCollection();
        GarageUtil gu = new GarageUtil();

        //------------ input our array size ------
        int arraySize = gu.ourCarCollectionSize();
        // ---------------------------------------

        garage.ourCollectionCreate(arraySize);

        garage.fillOurCollection();

        garage.printCarCollectionData();


    }
}
