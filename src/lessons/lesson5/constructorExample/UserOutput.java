package lessons.lesson5.constructorExample;

public class UserOutput {

    void printCat(Cat myCat){

        System.out.println("Your cat is: "+ myCat.name + " " + myCat.color + " " + myCat.age + " ");
        System.out.println("Is your cat hungry? " + myCat.isHungry);
    }
}
