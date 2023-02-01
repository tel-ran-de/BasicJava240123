package lessons.lesson3.calculator;

public class CalculatorOperations {

    public int sum(int x, int y) {
        int sumOfBothParameters = x + y;
        return sumOfBothParameters;
    }

    public int minus(int parameter1, int parameter2){
        int resultOfMinus = parameter1 - parameter2;
        return resultOfMinus;
    }


    public int multiplication(int parameter1, int parameter2){
        int resultOfMinus = parameter1 * parameter2;
        return resultOfMinus;
    }

    public double div(int parameter1, int parameter2){
        double resultOfDiv = parameter1 / (double) parameter2;
        // 5 / 2.0 = 2,5
        // 5 / 2 = 2

        return resultOfDiv;
    }

    public double divDoubleParameters(double parameter1, double parameter2){
        double resultOfDiv = parameter1 / parameter2;
        return resultOfDiv;
    }
}
