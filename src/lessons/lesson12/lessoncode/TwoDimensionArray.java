package lessons.lesson12.lessoncode;

public class TwoDimensionArray {
    public static void main(String[] args) {

        int[][] twoDimensionArray = new int[4][3];


        System.out.println("количество строк в массиве -" + twoDimensionArray.length);
        System.out.println("количество столбцов (элементов в строке) в массиве -" + twoDimensionArray[0].length);

        fillArray(twoDimensionArray);
        printArray(twoDimensionArray);



//        int[][] twoDimensionArray2 = {{1,2,3},
//                {4,5},
//                {6,7,8,9},
//                {10,11,12}};

    }

    public static void fillArray(int[][] workingArray){
        int count=1;
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[0].length; j++) {
                workingArray[i][j] = count;
                count++;
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
