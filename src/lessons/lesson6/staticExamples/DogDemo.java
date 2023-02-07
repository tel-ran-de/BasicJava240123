package lessons.lesson6.staticExamples;

import java.util.Scanner;

public class DogDemo {
    public static void main(String[] args) {


        //Dog.color = "grey";
        DogUtil.printDogInfo();

        Dog.color = "red";
        DogUtil.printDogInfo();


        Dog myDog1 = new Dog();
        myDog1.name = "Bobik";

        Dog myDog2 = new Dog();
        myDog2.name = "Sharik";


        System.out.println("My dog #1 is " + myDog1.name + " color is " +myDog1.color);
        System.out.println("My dog #2 is " + myDog2.name + " color is " +myDog2.color);

        myDog1.color = "tiger";

        System.out.println("My dog #1 is " + myDog1.name + " color is " +myDog1.color);
        System.out.println("My dog #2 is " + myDog2.name + " color is " +myDog2.color);


//        Dog.voice();
//
//
//        long x = Math.round(25.6);
//        Scanner scanner = new Scanner(System.in);
//
//        Dog newDog = new Dog();


    }
}
