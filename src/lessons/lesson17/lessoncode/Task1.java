package lessons.lesson17.lessoncode;

import java.util.Arrays;

public class Task1 {

       /*
    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
     */


    public static void main(String[] args) {
        TaskUtil tu = new TaskUtil();

        String[] calendar = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        String[] reversArray = tu.reverseWithAddArray(calendar);
        System.out.println(Arrays.toString(calendar));
        System.out.println(Arrays.toString(reversArray));

        tu.reverseWithoutAddArray(calendar);
        System.out.println(Arrays.toString(calendar));

    }

}
