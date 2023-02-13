package lessons.lesson9.lessoncode2;

public class TermoConverterTests {
    public static void main(String[] args) {
        KelvinAndFahrenheitConverter termoTest = new KelvinAndFahrenheitConverter();

        // ---------= TEST KELVIN =--------

        double tempCelsium = 0;
        double expectedResultTest = 273.15;
        double actualResultTest = termoTest.KelvinConverter(tempCelsium);

        printResult("Test 1 for Kelvin ", expectedResultTest, actualResultTest);


        tempCelsium = -273.150;
        expectedResultTest = 0;
        actualResultTest = termoTest.KelvinConverter(tempCelsium);

        printResult("Test 2 for Kelvin ", expectedResultTest, actualResultTest);



        // ---------= TEST FAHRENHEIT =--------

        tempCelsium = 0;
        expectedResultTest = 32;
        actualResultTest = termoTest.FahrenheitConverter(tempCelsium);

        printResult("Test 1 for Fahrenheit ", expectedResultTest, actualResultTest);


        tempCelsium = 100; // входные данные для работы вашего тестируемого метода

        expectedResultTest = 212;  // ожидаемый вами результат от работы метода (заранее вами просчитанный результат)

        actualResultTest = termoTest.FahrenheitConverter(tempCelsium); // реальный результат работы метода

        printResult("Test 2 for Fahrenheit ", expectedResultTest, actualResultTest);


    }

    public static void printResult(String message, double expectedResult, double actualResult){
        if (expectedResult == actualResult){
            System.out.println(message + " is OK!");
        } else {
            System.out.println(message + " is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }
    }


}
