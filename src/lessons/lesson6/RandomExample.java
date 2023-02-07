package lessons.lesson6;

public class RandomExample {
    public static void main(String[] args) {
        /*
            Math.random() *  (max - min + 1) + min
         */
        int random1 =  (int) (Math.random() *  (50 - 10 + 1) + 10);

        int random2 =  (int) (Math.random() *  (5 - 0 + 1) + 0);
        int random3 =  (int) (Math.random() *  (150 - 120 + 1) + 120);
        int random4 =  (int) (Math.random() *  (1000 - 550 + 1) + 550);
        int random5 =  (int) (Math.random() *  (1000000 - 150000 + 1) + 150000);



        System.out.println("1st random example : "+ Math.round(random1) );
        System.out.println("2st random example : "+ Math.round(random2)  );
        System.out.println("3st random example : "+ Math.round(random3) );
        System.out.println("4st random example : "+ Math.round(random4) );
        System.out.println("5st random example : "+ Math.round(random5) );
    }
}
