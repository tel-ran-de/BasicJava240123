package lessons.lesson9.lessoncode;

public class ColbaTest {
    public static void main(String[] args) {
        Colba colbaTest = new Colba(100,100);


        //----------- TEST1 -------

        colbaTest.setTemp1(100);
        colbaTest.setTemp2(100);

        boolean expectedResult = false;
        boolean actualResult = colbaTest.checkTemp();

        if (expectedResult == actualResult){
            System.out.println("Test 1 is OK!");
        } else {
            System.out.println("Test 1 is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }

        //----------- TEST2 -------

        colbaTest.setTemp1(110);
        colbaTest.setTemp2(90);

        expectedResult = true;
        actualResult = colbaTest.checkTemp();

        if (expectedResult == actualResult){
            System.out.println("Test 2 is OK!");
        } else {
            System.out.println("Test 2 is FAIL!!!");
            System.out.println("Expected result - " + expectedResult + ", but received " + actualResult);
        }

    }
}
