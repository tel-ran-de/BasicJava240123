package lessons.lesson8;

public class LoopForExample2 {
    public static void main(String[] args) {
        String workString = "For loop example.";

        System.out.println(0 + " char from our string is - " + workString.charAt(0));
        System.out.println(1 + " char from our string is - " + workString.charAt(1));
        System.out.println(2 + " char from our string is - " + workString.charAt(2));
        System.out.println(3 + " char from our string is - " + workString.charAt(3));

        //=-=-=--=-=-=-=-

        System.out.println(workString.length()-1 + " char from our string is - " + workString.charAt(workString.length()-1 ));


        System.out.println("====== FOR ======");

        for (int i = 0; i < workString.length(); i++) {

            System.out.println(i + " char from our string is - " + workString.charAt(i));

        }

        System.out.println("=======WHILE  =====");

        int counter=0;
        while (counter<workString.length()){
            System.out.println(counter + " char from our string is - " + workString.charAt(counter));
            counter++;
        }


    }
}
