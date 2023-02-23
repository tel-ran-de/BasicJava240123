package lessons.lesson14_15.lessoncode;

import java.util.Arrays;

public class Task1Util {
    public int inputData(String input){

        if (input.equals("from")){
            return 1;
        }

        if (input.equals("to")){
            return 100;
        }

        if (input.equals("size")){
            return 30;
        }

        return 0;
    }

    public int[] createArray(int arraySize){
        int[] createdArray = new int[arraySize];
       // int[] createdArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,5};
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
        System.out.println(message);
        System.out.println(Arrays.toString(arrayForPrinting));
    }

    public boolean isPrime(int number){
        boolean checkPrime = true;

        for (int i = 2; i < number ; i++) {
            if (number%i == 0){
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }

    public int countPrime(int[] workingArray){
        int counter = 0 ;
        for (int i = 0; i < workingArray.length; i++) {
            if  ((workingArray[i] != 1) && (isPrime(workingArray[i]))) {
                counter++;
            }
        }
        return counter;
    }

    public int findPrime(int[] workingArray, boolean direction){
        int primeElement = -1;
        boolean flag = true;
        int counter;

        if (direction) {
            counter = 0;
        } else {
            counter = workingArray.length-1;
        }

        while (flag){
            if ((workingArray[counter] != 1) && (isPrime(workingArray[counter]))){
                primeElement = workingArray[counter];
                flag = false;
            }

            if (direction) {
                counter++;
            } else {
                counter--;
            }
        }
        return primeElement;
    }

}
