package lessons.lesson3.calculator;

public class CalculatorUserInputExample {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        CalculatorOperations calculatorOperations = new CalculatorOperations();

        System.out.println("Please enter first integer number -");
        int x = userInput.userInputInteger();
        System.out.println("Please enter second integer number -");
        int y = userInput.userInputInteger();
        int sumOFNumbers = calculatorOperations.sum(x,y);
        System.out.println("Sum of numbers is " + sumOFNumbers);


        System.out.println("Please enter first double number -");
        double xDouble = userInput.userInputDouble();
        System.out.println("Please enter second double number -");
        double yDouble = userInput.userInputDouble();
        double divOFNumbersDouble = calculatorOperations.divDoubleParameters(xDouble,yDouble);
        System.out.println("Result of division of numbers is " + divOFNumbersDouble);

    }
}
