package lessons.lesson8;

import java.util.Scanner;

public class LoopWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        double y;

        boolean condition = true;



        while (condition == true) {

            System.out.println("Please enter two numbers. If you will enter first number 0 - exit");

            System.out.println("Enter x number -");
            x = scanner.nextDouble();

            System.out.println("Enter y number -");
            y = scanner.nextDouble();

            System.out.println("Add result - " + (x + y));

            if (( x<= 0) && ( y <= 0 )) {
                condition = false;
            }

            if (x + y > 1000) {
                condition = false;
            }
        }

        System.out.println("Stop loop while");

    }
}
