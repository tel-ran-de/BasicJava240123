package lessons.lesson7.lessoncode.ifAndRandomAndUserInput;

public class MethodsExample {
    public static void main(String[] args) {
        printData("Ivan", 25,"Petrov");
        printData("Petrov",25, "Ivan");

    }
     static void printData (String str1, int age, String str2){

         System.out.println("Hello " + str1 + " " + str2);
     }
}
