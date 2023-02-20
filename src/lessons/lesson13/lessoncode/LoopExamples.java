package lessons.lesson13.lessoncode;

import java.util.Arrays;

public class LoopExamples {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {

            if (i % 3 ==0) {
                array[i] = array[i] * 100;
            }
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            if (i % 3 !=0) {
                continue;
            }
            array[i] = array[i] * 100;
        }

        System.out.println(Arrays.toString(array));
    }
}
