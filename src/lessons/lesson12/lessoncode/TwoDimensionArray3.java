package lessons.lesson12.lessoncode;

public class TwoDimensionArray3 {
    public static void main(String[] args) {


        int[][] twoDimensionArray = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {10,11,12}};


        System.out.println("количество строк в массиве -" + twoDimensionArray.length);

        for (int i=0; i<twoDimensionArray.length; i++) {


            System.out.println("количество столбцов (элементов в строке " +i + ") в массиве -" + twoDimensionArray[i].length);


        }
        fillArray(twoDimensionArray);
        printArray(twoDimensionArray);





    }

    public static void fillArray(int[][] workingArray){
        int count=1;
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[i].length; j++) {
                workingArray[i][j] = count;
                count++;
            }
        }
    }

    public static void printArray(int[][] workingArray){

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[i].length; j++) {
                System.out.print(workingArray[i][j]+"  |  ");
            }
            System.out.println();
        }
    }
}
