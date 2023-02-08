package lessons.lesson7.lessoncode.ifAndRandomAndUserInput;

import java.util.Scanner;

public class UserInput {

    public int userInputInteger(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int userInputValue =  scanner.nextInt();
        return userInputValue;
    }
}
