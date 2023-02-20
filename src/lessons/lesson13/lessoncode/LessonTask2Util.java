package lessons.lesson13.lessoncode;

import java.util.Arrays;

public class LessonTask2Util {
    public int inputData(String input){

        if (input.equals("from")){
            return 0;
        }

        if (input.equals("to")){
            return 9;
        }

        if (input.equals("size")){
            return 15;
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

    public int countElements(int[] arrayForCounting){
        int counter = 0;
        for (int i = 0; i < arrayForCounting.length; i++) {
            if(arrayForCounting[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public void printArray(int[] arrayForPrinting, String message){
        System.out.println(Arrays.toString(arrayForPrinting));
        System.out.println(message);
    }

    public void fillEvenElements(int[] arrayWithEvenElements, int[] originalArray){
        int counter = 0;
        for (int i = 0; i < originalArray.length; i++) {
                if(originalArray[i] % 2 == 0){
                    arrayWithEvenElements[counter] = originalArray[i];
                    counter++;
                }
            }
    }

}
