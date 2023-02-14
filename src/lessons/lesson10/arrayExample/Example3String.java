package lessons.lesson10.arrayExample;

import java.util.Arrays;

public class Example3String {
    public static void main(String[] args) {
        String[] array1 = {"A","B","C","D"};

        System.out.println("array1 - " + array1);

        System.out.println("array1 - " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array1[i] = array1[i] + "/<>?";
            }
        }

        System.out.println("array1 - " + Arrays.toString(array1));


        String[] array2 = array1.clone();

        for (int i = 0; i < array2.length; i++) {
            if (i % 2 != 0) {
                array2[i] = "";
            }
        }

        System.out.println("array2 - " + Arrays.toString(array2));
        System.out.println("________________");

        System.out.println("array1 - " + Arrays.toString(array1));
        System.out.println(array2);


    }
}
