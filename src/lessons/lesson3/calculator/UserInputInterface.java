package lessons.lesson3.calculator;

public class UserInputInterface {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        System.out.println("Please enter integer number -");
        int userEnterInteger = userInput.userInputInteger();

        System.out.println("Your number is " + userEnterInteger);

        System.out.println("Please enter double number -");
        double userEnterDouble = userInput.userInputDouble();

        System.out.println("Your number is " + userEnterDouble);

        System.out.println("Please enter text number -");
        String userEntertext = userInput.userInputText();

        System.out.println("Your text is " + userEntertext);



    }
}
