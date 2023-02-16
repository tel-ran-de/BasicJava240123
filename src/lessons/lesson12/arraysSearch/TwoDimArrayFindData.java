package lessons.lesson12.arraysSearch;

public class TwoDimArrayFindData {
    public static void main(String[] args) {
        int[][] twoDimensionArray = new int[4][3];


        System.out.println("количество строк в массиве -" + twoDimensionArray.length);
        System.out.println("количество столбцов (элементов в строке) в массиве -" + twoDimensionArray[0].length);

        fillArrayRandom(twoDimensionArray);
        printArray(twoDimensionArray);
        System.out.println("Max element - " + findMaxElement(twoDimensionArray));
        System.out.println("Min element - " + findMinElement(twoDimensionArray));



    }

    public static void fillArrayRandom(int[][] workingArray){


        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                workingArray[i][j] = (int) (Math.random()*50);
            }
        }
    }

    public static void printArray(int[][] workingArray){

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                System.out.print(workingArray[i][j]+"  |  ");
            }
            System.out.println();
        }
    }


    public static int findMaxElement(int[][] workingArray){

        int maxElement = workingArray[0][0];

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                if (maxElement < workingArray[i][j]) {
                    maxElement = workingArray[i][j];
                }
            }
        }
        return maxElement;
    }

    public static int findMinElement(int[][] workingArray){

        int minElement = workingArray[0][0];

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                if (minElement > workingArray[i][j]) {
                    minElement = workingArray[i][j];
                }
            }
        }
        return minElement;
    }

}
