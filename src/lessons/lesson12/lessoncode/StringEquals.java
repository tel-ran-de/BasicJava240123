package lessons.lesson12.lessoncode;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        String str3 = str1;

        String str4 = new String("Java");

        String str5 = "JAVA";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));


    }
}
