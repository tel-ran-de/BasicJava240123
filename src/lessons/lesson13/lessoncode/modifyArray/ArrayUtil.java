package lessons.lesson13.lessoncode.modifyArray;

import java.util.Arrays;

public class ArrayUtil {

    public int inputData(String input){


        if (input.equals("from")){
            return 0;
        }

        if (input.equals("to")){
            return 90;
        }

        if (input.equals("size")){
            return 15000000;
        }

        return 0;
    }

    public int[] createArray(int arraySize){
        int[] createdArray = new int[arraySize];
        return createdArray;
    }

    public void fillArray(int[] arrayForFilling, int fromRange, int toRange) {
        for (int i = 0; i < arrayForFilling.length; i++) {
            arrayForFilling[i] = randomValue(fromRange,toRange);
        }
    }

    public int randomValue(int fromNumber, int toNumber){
        int pseudoRandom = (int) (Math.random()*(toNumber - fromNumber + 1) + fromNumber);
        return pseudoRandom;
    }


    public void printArray(int[] arrayForPrinting, String message){
        System.out.println(Arrays.toString(arrayForPrinting));
        System.out.println(message);
    }
}
