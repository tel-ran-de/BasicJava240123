package lessons.lesson13.lessoncode.twoDimArray;

import java.util.Arrays;

public class TwoDimArray {
    // input array size
    // create array
    // fill array
    // find max , min
    // modify array

    public static void main(String[] args) {

        CreateAndFillArray createAndFillArray = new CreateAndFillArray();
        ArrayUtil arrayUtil = new ArrayUtil();

        // получаем размер нашего массива

        int arrayLines = UserInterface.userArrayInput("Please enter number of lines in our array");
        int arrayColons = UserInterface.userArrayInput("Please enter number of colons in our array");

        // создаем пустой новый массив

        int[][] workingArray = createAndFillArray.createArray(arrayLines,arrayColons);

        // заполняем массив

        createAndFillArray.fillArray(workingArray, true, 100);

       arrayUtil.printArray(workingArray);

        System.out.println("Max element = " + arrayUtil.findMaxElement(workingArray));
        System.out.println("Min element = " + arrayUtil.findMinElement(workingArray));


        arrayUtil.printArray(arrayUtil.transpondArray(workingArray));


    }

}
