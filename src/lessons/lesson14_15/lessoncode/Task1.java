package lessons.lesson14_15.lessoncode;

public class Task1 {
    public static void main(String[] args) {
             /*
        Создайте массив из 30 случайных целых чисел из отрезка [0;100].
   Подсчитайте сколько в массиве простых чисел и
   выведете это количество на экран.
           Выведете первое простое число и последнее.

        1) создание массива
        2) заполнение случайными числами из заданного диапазона
        3) Подсчет простых чисел
        4) Вывод на экран

         */


            Task1Util tu = new Task1Util();

            int fromRange = tu.inputData("from");
            int toRange = tu.inputData("to");
            int sizeArray = tu.inputData("size");

            int[] workingArray = tu.createArray(sizeArray);


            tu.fillArray(workingArray,fromRange,toRange);
            tu.printArray(workingArray,"Our array :");
            System.out.println(" Prime number counter - " + tu.countPrime(workingArray));

            System.out.println("First prime number in our array is " + tu.findPrime(workingArray,true));
            System.out.println("Last prime number in our array is " + tu.findPrime(workingArray,false));

        }

}
