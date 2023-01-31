package lessons.lesson2;

public class CatAndDogExample {
    public static void main(String[] args) {

        Dog myFirstDog = new Dog();
        Dog mySecondDog = new Dog();

        Cat ourFirstCat = new Cat();
        Cat ourSecondCat = new Cat();

        System.out.println(myFirstDog);

        System.out.println(mySecondDog);

        System.out.println(ourFirstCat);

        System.out.println(ourSecondCat);

        myFirstDog.name = "Bobik";
        myFirstDog.age = 2;
        myFirstDog.breed = "Kolly";

        mySecondDog.name = "Barbos";
        mySecondDog.age = 4;
        mySecondDog.breed = "Taksa";

        ourFirstCat.name = "Murzik";
        ourFirstCat.age = 3;
        ourFirstCat.color = "Black";

        ourSecondCat.name = "Lucky";
        ourSecondCat.age = 2;
        ourSecondCat.color = "Red";

        System.out.println(myFirstDog);

        System.out.println(mySecondDog);

        System.out.println(ourFirstCat);

        System.out.println(ourSecondCat);



    }
}
