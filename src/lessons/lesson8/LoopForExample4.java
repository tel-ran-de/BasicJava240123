package lessons.lesson8;

import java.util.Random;

public class LoopForExample4 {
    public static void main(String[] args) {
        Random random = new Random();

        int calculationResult = 0;



        for (int i = 0; i < 10; i++) {

                int randomValue = random.nextInt(100);

            System.out.println("i = "+ i + " random = " + randomValue);

            calculationResult = calculationResult + randomValue;
        }

        System.out.println("Sum of all random is " + calculationResult);
    }
}
