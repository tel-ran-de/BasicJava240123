package lessons.lesson10.arrayExample;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] arrayInt = new int[3];
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 1;

        System.out.println(Arrays.toString(arrayInt));

        int min = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }

        System.out.println("Min element = " + min);

        int max= arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
        }

        System.out.println("Max element = " + max);

    }
}
