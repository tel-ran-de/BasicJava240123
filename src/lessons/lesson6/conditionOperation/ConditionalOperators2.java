package lessons.lesson6.conditionOperation;

public class ConditionalOperators2 {

    public static void main(String[] args) {


        int x = 30;

       // x > 0 - положительное число
       // x > 50 - положительное число, но больше 50
       // x < 75 - менее 75
       //x < 1000 - менее 1000


//        if (x > 0) {
//            System.out.println("x > 0");
//        }
        if (x > 50) {
            System.out.println("x > 50");
        }  else if (x > 0) {
            System.out.println("x > 0");
        }



        if (x < 25) {
            System.out.println("x < 25");
        }
        if (x < 1000) {
            System.out.println("x < 1000");
        }




    }
}
