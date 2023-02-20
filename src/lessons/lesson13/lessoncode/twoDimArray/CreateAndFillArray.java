package lessons.lesson13.lessoncode.twoDimArray;

import java.util.Scanner;

public class CreateAndFillArray {

    public int[][] createArray(int lines, int colons){
        int[][] createdArray = new int[lines][colons];
        return createdArray;
    }

    public void fillArray(int[][] workingArray, boolean createArrayByRandom, int randomRange){
        if (createArrayByRandom){
            fillArrayByRandom(workingArray,randomRange);
        } else {
            fillArrayByUserInput(workingArray);
        }
    }

    public void fillArrayByUserInput(int[][] workingArray){

        System.out.println("Please enter array data");

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                workingArray[i][j] = UserInterface.userArrayInput("Please enter data for " + i + " line " + j + " colon cell ");
            }
        }
    }

    public void fillArrayByRandom (int[][] workingArray, int randomRange){
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                workingArray[i][j] = (int) (Math.random()*randomRange);
            }
        }
    }

}
