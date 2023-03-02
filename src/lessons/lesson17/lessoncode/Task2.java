package lessons.lesson17.lessoncode;

import lessons.lesson13.lessoncode.modifyArray.ArrayUtil;

import java.util.Arrays;

public class Task2 {
     /*
    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
 Введенное пользователем число сохраняется в переменную n.
 Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
     */
     public static void main(String[] args) {
         TaskUtil tu = new TaskUtil();

         int arraySize = tu.inputArraySize();
         int[] array = new int[arraySize];
         tu.fillArray(array);
         System.out.println(Arrays.toString(array));
         int[] evenElements = tu.createEvenElementsArray(array);
         System.out.println(Arrays.toString(evenElements));

     }
}
