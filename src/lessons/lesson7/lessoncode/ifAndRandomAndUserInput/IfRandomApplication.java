package lessons.lesson7.lessoncode.ifAndRandomAndUserInput;

public class IfRandomApplication {
    /*
    Написать программу, которая:
     1) запрашивает у пользователя два целых числа из заданного диапазона
     2) генерирует случайное целое число из заданного диапазона
     3) сравнивает эти три числа и
        а) если есть равные значения то выводит соответсвующее уведомление
        б) если все три разные то также сообщает об этом
        в) выводи эти числа в виде возрастающей последовательности

     */

    public static void main(String[] args) {
        /*
        1) запросить у пользователя первое число из заданного диапазона
        2) запросить у пользователя первое число из заданного диапазона
        3) генерация случайного числа из заданного диапазона
        4) проверка на равенство между числами
        5) вывод информации "равно" или "не равно"
        6) вывод в виде возрастающей последовательности
         */

        UserInput ui = new UserInput();
        RandomGenerator rg = new RandomGenerator();

        int startRangeValue = 10;
        int endRangeValue = 100;

        String message = "Please enter first integer number between " + startRangeValue + " to " + endRangeValue + " : ";

        int firstData = ui.userInputInteger(message);

        message = "Please enter second integer number between " + startRangeValue + " to " + endRangeValue + " : ";

        int secondData = ui.userInputInteger(message);

        message = "Generate random third integer number between " + startRangeValue + " to " + endRangeValue + " : ";

        int thirdData = rg.integerRandomGenerator(message,startRangeValue,endRangeValue);



    }


}
