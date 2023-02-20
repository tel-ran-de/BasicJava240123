package lessons.lesson13.lessoncode;

public class LessonTask1 {
     /*
        Создайте массив из всех нечётных чисел от 1 до 99,
    выведите его на экран в строку в обратном порядке
    создать второй массив из элементов первого и поместить их в обратном порядке

    // определить размер массива
    // создание массива
    // наполнение массива
            // вычисление четное или нечетное число
    // вывод на экран
    // создать второй массив
    // скопировать данные в обратном порядке

         */

    public static void main(String[] args) {
        LessonTask1Util lu = new LessonTask1Util();

        int fromRange = lu.inputData("from");
        int toRange = lu.inputData("to");

        int arraySize = lu.detectArraySize(fromRange, toRange);

        int[] workingArray = lu.createArray(arraySize);

        lu.fillArray(workingArray,fromRange,toRange);
        lu.printArray(workingArray);

        int[] reverseArray = lu.createArray(arraySize);
        lu.reverseArray(reverseArray,workingArray);
        lu.printArray(reverseArray);


    }





}
