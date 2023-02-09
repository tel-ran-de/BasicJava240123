package lessons.lesson7.lessoncode.ifAndRandomAndUserInput;

public class NumberUtilTest {
    public static void main(String[] args) {
        NumbersUtils nuForTest = new NumbersUtils();
        //------- TEST 1 -------
        int param1 = 1;
        int param2 = 10;

        boolean expectedResult = false;
        boolean actualResult = nuForTest.isEquals(param1,param2);

        if (expectedResult == actualResult){
            System.out.println("Test 'isEqual' #1 is OK!");
        } else {
            System.out.println("Test 'isEqual' #1 is FAIL!");
            System.out.println("Expected result - " + expectedResult + ", but received - " + actualResult);
        }
        //------- TEST 2 -------
        param1 = 10;
        param2 = 10;

        expectedResult = true;
        actualResult = nuForTest.isEquals(param1,param2);

        if (expectedResult == actualResult){
            System.out.println("Test 'isEqual' #2 is OK!");
        } else {
            System.out.println("Test 'isEqual' #2 is FAIL!");
            System.out.println("Expected result - " + expectedResult + ", but received - " + actualResult);
        }


    }
}
