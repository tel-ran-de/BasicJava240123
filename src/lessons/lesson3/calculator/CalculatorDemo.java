package lessons.lesson3.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperations calculatorOperations = new CalculatorOperations();

        int a = 5;
        int b = 10;

        int resultOfSum = calculatorOperations.sum(a,b);

        System.out.println(resultOfSum);

    }
}
