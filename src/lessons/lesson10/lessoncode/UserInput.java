package lessons.lesson10.lessoncode;

import java.util.Scanner;

public class UserInput {

    public int userInputInteger(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int userInputValue =  scanner.nextInt();
        return userInputValue;
    }

    public double userInputDouble(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }
}
