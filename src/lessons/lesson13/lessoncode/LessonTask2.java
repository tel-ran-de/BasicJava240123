package lessons.lesson13.lessoncode;

public class LessonTask2 {

           /*
        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
   Подсчитайте сколько в массиве чётных элементов и
   выведете это количество на экран на отдельной строке.

        1) создание массива
        2) заполнение случайными числами из заданного диапазона
        3) Подсчет четных элементов
        4) Вывод на экран

         */

    public static void main(String[] args) {

        LessonTask2Util lu2 = new LessonTask2Util();

        int fromRange = lu2.inputData("from");
        int toRange = lu2.inputData("to");
        int sizeArray = lu2.inputData("size");

        int[] workingArray = lu2.createArray(sizeArray);


        lu2.fillArray(workingArray,fromRange,toRange);

        int counter = lu2.countElements(workingArray);

        lu2.printArray(workingArray, "Count of even elements in our array is " + counter);

        int[] arrayWithEvenElements = lu2.createArray(counter);
        lu2.fillEvenElements(arrayWithEvenElements, workingArray);
        lu2.printArray(arrayWithEvenElements, "");

    }


}

