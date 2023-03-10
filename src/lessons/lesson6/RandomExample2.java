package lessons.lesson6;

import java.util.Random;

public class RandomExample2 {
    public static void main(String[] args) {

        Random randomWithClass = new Random();


        /*
            random() *  (max - min + 1) + min
         */
        int random1 =  randomWithClass.nextInt() ;

        int min = 5;
        int max = 100;
        int diff = max - min;

        int random2 = randomWithClass.nextInt(diff+1) + min;


        System.out.println("1st random example : "+ random1 ); // Диапазон из всех целых чисел от -... до +...
        System.out.println("2st random example : "+ random2 ); // Диапазон значений от min до max
        System.out.println("3st random example : "+ randomWithClass.nextInt(100) ); // Диапазон значений от 0 до 100

    }
}
