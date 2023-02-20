package lessons.lesson13.lessoncode.twoDimArray;

import java.util.Scanner;

public class UserInterface {
    public static int userArrayInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
