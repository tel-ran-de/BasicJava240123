package lessons.lesson13.lessoncode.twoDimArray;

public class ArrayUtil {

    public int findMaxElement(int[][] workingArray){
        int maxElement = workingArray[0][0];

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                if (workingArray[i][j] > maxElement) {
                    maxElement = workingArray[i][j];
                }
            }
        }
        return maxElement;
    }

    public int findMinElement(int[][] workingArray){
        int minElement = workingArray[0][0];

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                if (workingArray[i][j] < minElement) {
                    minElement = workingArray[i][j];
                }
            }
        }
        return minElement;
    }

    /*
    1 2 3 4
    5 6 7 8

    1 5
    2 6
    3 7
    4 8

     */

    public int[][] transpondArray(int[][] workingArray){
        int[][] tranpordArray = new int[workingArray[0].length][workingArray.length];

        for (int i = 0; i < tranpordArray.length; i++) {
            for (int j = 0; j < tranpordArray[0].length; j++) {
                     tranpordArray [i][j] = workingArray[j][i];
            }
        }

        return tranpordArray;

    }

    public void printArray(int[][] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                System.out.print(workingArray[i][j] + " , ");
            }
            System.out.println();
        }
    }


}
