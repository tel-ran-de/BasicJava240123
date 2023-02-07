package lessons.lesson6.staticExamples;

public class PersonDemo {
    public static void main(String[] args) {
        System.out.println();
        Person personOlga = new Person("Olga");
        //personOlga.name = "Olga Petrovna";
        personOlga.town = "Dnepropetrovsk";


        Person personPetr = new Person("Petr");
       // personPetr.name = "Petr";
       personPetr.town = "Dnepropetrovsk";




        System.out.println("======== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);



        System.out.println("======== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


        personPetr.town = "Kiev";

        System.out.println("======== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("======== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


    }
}
