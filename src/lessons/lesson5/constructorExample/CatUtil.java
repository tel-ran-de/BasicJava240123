package lessons.lesson5.constructorExample;

public class CatUtil {

    Cat createCat(){
        UserInput ui = new UserInput();
        String catName = ui.userInputText("Please enter cat name ");
        String catColor = ui.userInputText("Please enter cat color ");
        int catAge = ui.userInputInt("Please enter cat age ");
        boolean catHungry = ui.userInputBoolean("Is cat hungry? ");

        Cat newCat = new Cat(catName,catColor,catAge,catHungry);

        return newCat;
    }
}
