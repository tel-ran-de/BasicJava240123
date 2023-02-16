package lessons.lesson12.lessoncode;

public class TwoDimensionArray2 {
    public static void main(String[] args) {

        int[][] twoDimensionArray = new int[10][10];


        System.out.println("количество строк в массиве -" + twoDimensionArray.length);
        System.out.println("количество столбцов (элементов в строке) в массиве -" + twoDimensionArray[0].length);

        fillArray(twoDimensionArray);
        printArray(twoDimensionArray);



    }

    public static void fillArray(int[][] workingArray){

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                workingArray[i][j] = (i+1)*(j+1);
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
}
