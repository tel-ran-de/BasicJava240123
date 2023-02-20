package lessons.lesson13.lessoncode.modifyArray;

import lessons.lesson13.lessoncode.LessonTask2Util;

public class WorkWithArray {
    public static void main(String[] args) {
        /*
        создать новый массив
        заполнить его
        расширить размер массива
        добавить еще один элемент в массив
         */

        ArrayUtil au = new ArrayUtil();
        ModifyArray modifyArray = new ModifyArray();

        int fromRange = au.inputData("from");
        int toRange = au.inputData("to");
        int sizeArray = au.inputData("size");

        int[] workingArray = au.createArray(sizeArray);


        au.fillArray(workingArray,fromRange,toRange);

       //au.printArray(workingArray,"Our array");

        long  currentTime= System.currentTimeMillis();

       workingArray = modifyArray.addNewElement(workingArray);

      // au.printArray(workingArray,"Our array after add");

        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime= System.currentTimeMillis();

        workingArray = modifyArray.deleteLastElement(workingArray);

        //au.printArray(workingArray,"Our array after delete");
        System.out.println(System.currentTimeMillis() - currentTime);
        currentTime= System.currentTimeMillis();

        workingArray = modifyArray.deleteLastElement(workingArray);

        //au.printArray(workingArray,"Our array after delete");

        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
