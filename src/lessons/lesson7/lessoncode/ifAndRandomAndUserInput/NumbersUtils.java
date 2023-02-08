package lessons.lesson7.lessoncode.ifAndRandomAndUserInput;

public class NumbersUtils {

    boolean isEquals(int number1, int number2){
        boolean checkResult = false;
        if (number1 == number2){
            checkResult = true;
        }
        return checkResult;
    }


    void numbersControl(int number1, int number2, int number3){

        boolean anyNotEquals = true;

        if (isEquals(number1,number2) && isEquals(number2,number3)){
            anyNotEquals = false;
            System.out.println("All numbers are equals!!!");
        } else {
            if (isEquals(number1, number2)) {
                anyNotEquals = false;
                System.out.println("Number first and number second are equals!");
            }
            if (isEquals(number2, number3)) {
                anyNotEquals = false;
                System.out.println("Number second and number third are equals!");
            }
            if (isEquals(number1, number3)) {
                anyNotEquals = false;
                System.out.println("Number first and number third are equals!");
            }
        }

        if (anyNotEquals) {
            System.out.println("All numbers are NOT equals!!!");
        }


    }


    void printGrowing(int number1, int number2, int number3){
        checkGrow(number1, number2, number3); // вызов метода  checkGrow  - > 1, 2, 3
        checkGrow(number2, number1, number3);// вызов метода  checkGrow  - > 2, 1, 3
        checkGrow(number3, number1, number2);// вызов метода  checkGrow  - > 3, 1, 2
        checkGrow(number3, number2, number1);// вызов метода  checkGrow  - > 3, 2, 1


    }

    private static void checkGrow(int n1, int n2, int n3) {
        if((n1 > n2) && (n2 > n3)){
            System.out.println("Here are numbers in increasing order :" + n1 + ", " + n2 + ", " + n3) ;
        }
    }


}
