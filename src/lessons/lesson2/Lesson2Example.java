package lessons.lesson2;

public class Lesson2Example {
    public static void main(String[] args) {
        byte var1 = 1;
        boolean var2 = true;
        short var3 = 30001;
        long var4 = 12305734528724L;
        int var5 = 123456;
        char var6 = 's';
        double var7 = 3.1415;
        float var8 = 2.73123f;


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

        String text = "Our new text";

        System.out.println(text);

        String newText = "This is our variable1 - " + var1 + " and variable2 - " +var2;

        System.out.println(newText);

        System.out.println("Or another message "+ var5 + " integer");

    }
}
