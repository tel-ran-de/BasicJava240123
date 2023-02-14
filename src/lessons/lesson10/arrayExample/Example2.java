package lessons.lesson10.arrayExample;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};

        System.out.println("array1 - " + array1);

        System.out.println("array1 - " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array1[i] = array1[i] * 10;
            }
        }

        System.out.println("array1 - " + Arrays.toString(array1));


        int[] array2 = array1.clone();

        for (int i = 0; i < array2.length; i++) {
            if (i % 2 != 0) {
                array2[i] = 0;
            }
        }

        System.out.println("array2 - " + Arrays.toString(array2));
        System.out.println("________________");

        System.out.println("array1 - " + Arrays.toString(array1));
        System.out.println(array2);


    }
}
