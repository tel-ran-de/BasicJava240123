package lessons.lesson13.lessoncode;

public class LessonTask1Util {

    public int inputData(String input){

        if (input.equals("from")){
            return 1;
        }

        if (input.equals("to")){
            return 99;
        }
        return 0;
    }


    public int detectArraySize(int fromRange, int toRange){
        int arraySize = Math.round((toRange - fromRange)/2)+1;
//        int arraySize = 0;
//        for (int i = fromRange; i <= toRange ; i++) {
//            if (i%2 != 0) {
//                arraySize++;
//            }
//        }

        return arraySize;
    }

    public int[] createArray(int arraySize){
        int[] createdArray = new int[arraySize];
        return createdArray;
    }

    public void fillArray(int[] arrayForFilling, int fromRange, int toRange){
        int counter = 0;

        for (int i = fromRange; i <= toRange; i++) {
            if (i%2 != 0) {
                arrayForFilling[counter] = i;
                counter++;
            }
        }
    }

    public void printArray(int[] arrayForPrinting){
        for (int i = arrayForPrinting.length-1; i >= 0; i--) {
            System.out.print(arrayForPrinting[i]+", ");
        }
        System.out.println();
    }

    public void  reverseArray(int[] reverseArray, int[] originalArray){
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length-1-i];
        }
    }
}
