package lessons.lesson6.conditionOperation;

public class ConditionalOperators {

    public static void main(String[] args) {

        int x = 50;

            /* x > 0 - результат true или  false в нашем случае - true
               x <=100 - результат true или  false в нашем случае - false
               true && false  => 150 > 0  но не верно что 150 <=100

               результат && :  true только если оба выражения будут  true

             */
        // (true && false) = false
        if (x > 0 && x <= 100) {
            System.out.println("x is between 0 and 100");
            //(true && true)
        } else if (x > 100 && x <= 200) {
            System.out.println("x is between 100 and 200");
        }


        if (x<0 || x>200) {
            System.out.println("x out of bound 0 - 200");
        }


        boolean isNotRain = false;
        boolean isWind = false;
        boolean isSun  = false;


        //
        // true / false???   true / false???    true / false???
        //       ^                  ^                 ^
        //       |                  |                 |
        if ((isSun==true) && (isNotRain==true) && (isWind==false)) {
            System.out.println("Идем гулять без зонтом");
        }





        if (isSun && isNotRain && !isWind) {
            System.out.println("Идем гулять без зонтом");
        }

        if (isSun && isNotRain && isWind) {
            System.out.println("Идем гулять без зонта, но сильный ветер!");
        }

        if (isSun && !isNotRain && isWind) {
            System.out.println("Идем гулять с зонтом, но сильный ветер");
        }

        if (!isSun && !isNotRain && !isWind) {
            System.out.println("Гулять не идем. Сидим дома!!!");
        }
    }
}
