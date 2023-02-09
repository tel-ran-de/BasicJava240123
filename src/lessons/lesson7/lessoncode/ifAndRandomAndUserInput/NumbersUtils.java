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


//        if((number1 > number2) && (number2 > number3)){
//            System.out.println("Here are numbers in increasing order :" + number1 + ", " + number2 + ", " + number3) ;
//        }
//
//        if((number1 > number3) && (number3 > number2)){
//            System.out.println("Here are numbers in increasing order :" + number1 + ", " + number3 + ", " + number2) ;
//        }
//
//        if((number2 > number1) && (number1 > number3)){
//            System.out.println("Here are numbers in increasing order :" + number2 + ", " + number1 + ", " + number3) ;
//        }
//
//        if((number2 > number3) && (number3 > number1)){
//            System.out.println("Here are numbers in increasing order :" + number2 + ", " + number3 + ", " + number1) ;
//        }
//
//        if((number3 > number1) && (number1 > number2)){
//            System.out.println("Here are numbers in increasing order :" + number3 + ", " + number1 + ", " + number2) ;
//        }
//
//        if((number3 > number2) && (number2 > number1)){
//            System.out.println("Here are numbers in increasing order :" + number3 + ", " + number2 + ", " + number1) ;
//        }

        if (checkGrow(number1, number2, number3)) {
            printData(number1,number2,number3);
        } else if (checkGrow(number1, number3, number2)) {
            printData(number1,number3,number2);
        } else if (checkGrow(number2, number1, number3)) {
            printData(number2,number1,number3);
        } else if (checkGrow(number2, number3, number1)) {
            printData(number2,number3,number1);
        } else if (checkGrow(number3, number1, number2)) {
            printData(number3,number1,number2);
        } else if (checkGrow(number3, number2, number1)) {
            printData(number3,number2,number1);
        }
    }

    private  boolean checkGrow(int n1, int n2, int n3) {
        if((n1 <= n2) && (n2 <= n3)){
            return true;}
        return false;
    }

    private void printData(int n1, int n2, int n3){
        System.out.println("Here are numbers in increasing order :" + n1 + ", " + n2 + ", " + n3) ;
    }
}
