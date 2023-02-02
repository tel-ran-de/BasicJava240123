package lessons.lesson4.constructorExample;

public class CatDemo {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.name = "Barsik";
        myCat.color= "White";
        myCat.age = 2;

        String message = "My cat name - " + myCat.name + " color - " + myCat.color + " age - " + myCat.age;

        System.out.println(message);

        Cat myCat2 = new Cat("Lucky","grey",3);

        message = "My cat name - " + myCat2.name + " color - " + myCat2.color + " age - " + myCat2.age;

        System.out.println(message);

        //Cat myCat3 = new Cat("Murzik");

    }
}
