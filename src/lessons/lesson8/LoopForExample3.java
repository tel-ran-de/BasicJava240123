package lessons.lesson8;

import java.util.Random;

public class LoopForExample3 {
    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 50; i >= 0; i--) {
            int calculationResult;

            if (i % 2 == 0) {
                calculationResult = i*i* random.nextInt(100);
            } else {
                calculationResult = i*i*i* random.nextInt(1000);
            }

            System.out.println("i = "+ i + " random = " + calculationResult);
        }

    }
}
