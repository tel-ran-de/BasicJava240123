package lessons.lesson7.lessoncode.ifAndRandomAndUserInput;

import java.util.Random;

public class RandomGenerator {

    int integerRandomGenerator(String message, int startRangeValue, int endRangeValue){

        System.out.println(message);
        int randomValue = (int) (Math.random()*(endRangeValue-startRangeValue+1) + startRangeValue);

        return 15;
    }
}
