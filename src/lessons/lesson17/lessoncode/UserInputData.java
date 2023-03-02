package lessons.lesson17.lessoncode;

import java.util.Scanner;

public class UserInputData {
    int intUserInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
