package lessons.lesson12.arraysSearch;

public class TwoDimArrayFindDataTest {
    public static void main(String[] args) {

        TwoDimArrayFindData tdf = new TwoDimArrayFindData();

            int[][] twoDimensionArray = {{10,20,30,5},{25,15,-10,0},{1,-5,121,12},{47,21,-7,52}};

            int expectedMaxElement = 121;
            int expectedMinElement = -10;

            int actualMaxElement = tdf.findMaxElement(twoDimensionArray);
            int actualMinElement = tdf.findMinElement(twoDimensionArray);

            //----- TEST 1 Max element

        if (expectedMaxElement == actualMaxElement){
            System.out.println("Test 1 for find Max element in array is OK!");
        } else {
            System.out.println("Test 1 for find Max element in array is FAIL!");
            System.out.println("Expected result " + expectedMaxElement +
                    " but received " + actualMaxElement);
        }
        //----- TEST 2 Min element

        if (expectedMinElement == actualMinElement){
            System.out.println("Test 2 for find Min element in array is OK!");
        } else {
            System.out.println("Test 2 for find Min element in array is FAIL!");
            System.out.println("Expected result " + expectedMinElement +
                    " but received " + actualMinElement);
        }
    }
}
