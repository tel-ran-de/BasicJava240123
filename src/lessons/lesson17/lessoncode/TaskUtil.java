package lessons.lesson17.lessoncode;

public class TaskUtil {

    String[] reverseWithAddArray(String[] workingArray) {
        String[] arrayAfterReverse = new String[workingArray.length];

        for (int i = workingArray.length - 1; i >= 0; i--) {
            arrayAfterReverse[workingArray.length - 1 - i] = workingArray[i];
        }
        return arrayAfterReverse;
    }

    void reverseWithoutAddArray(String[] workingArray) {
        String temp = "";
        for (int i = 0; i < workingArray.length / 2; i++) {
            temp = workingArray[i];
            workingArray[i] = workingArray[workingArray.length - 1 - i];
            workingArray[workingArray.length - 1 - i] = temp;
        }

    }

    int inputArraySize() {
        UserInputData userInputData = new UserInputData();
        int arraySize = 0;
        boolean notCorrectInput = true;
        while (notCorrectInput) {
            arraySize = userInputData.intUserInput("Please enter array size ( > 3) ");
            if (arraySize > 3) {
                notCorrectInput = false;
            } else {
                System.out.println("Incorrect input array size.");
            }
        }
        return arraySize;
    }

    void fillArray(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = (int) (Math.random()*(workingArray.length));
        }
    }

    int countEvenNumbers(int[] workingArray){
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] % 2 ==0){
                counter++;
            }
        }
        return counter;
    }

    int[] createEvenElementsArray(int[] workingArray){

        int evenElementsArraySize = countEvenNumbers(workingArray);
        int[] evenElementsArray = new int[evenElementsArraySize];
        int counter = 0;

        for (int i = 0; i < workingArray.length ; i++) {
            if (workingArray[i] % 2 == 0){
                evenElementsArray[counter] = workingArray[i];
                counter++;
            }
        }
        return evenElementsArray;
    }

}
