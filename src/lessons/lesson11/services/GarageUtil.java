package lessons.lesson11.services;

public class GarageUtil {

    public int ourCarCollectionSize(){
        UserInput ui = new UserInput();
        return ui.userInputInteger("Please enter your car collection size: ");
    }

}
