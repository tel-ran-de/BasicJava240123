package lessons.lesson5.constructorExample;

public class CatDemo {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        UserOutput uo = new UserOutput();
        CatUtil catUtil = new CatUtil();

////        //--------- допустим у нас есть блок кода в котором пользователь вводит
////        // данные или мы получаем их из интернета -----
////
////        String catName = ui.userInputText("Please enter cat name ");
////        String catColor = ui.userInputText("Please enter cat color ");
////        int catAge = ui.userInputInt("Please enter cat age ");
////        boolean catHungry = ui.userInputBoolean("Is cat hungry? ");
////        //---------------------
//
//
//
//        Cat myFirstCat = new Cat(catName,catColor,catAge,catHungry);
//
//
//        catName = ui.userInputText("Please enter cat name ");
//        catColor = ui.userInputText("Please enter cat color ");
//        catAge = ui.userInputInt("Please enter cat age ");
//        catHungry = ui.userInputBoolean("Is cat hungry? ");
//        //---------------------
//
//        Cat mySecondCat = new Cat(catName,catColor,catAge,catHungry);



        Cat myFirstCat = catUtil.createCat();
        Cat mySecondCat = catUtil.createCat();
        uo.printCat(myFirstCat);
        uo.printCat(mySecondCat);




    }
}
