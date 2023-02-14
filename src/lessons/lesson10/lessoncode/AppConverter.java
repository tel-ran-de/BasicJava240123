package lessons.lesson10.lessoncode;

public class AppConverter {

    public static void main(String[] args) {

        UserInput ui = new UserInput();
        Converter converter = new Converter();

        double exchangeRateUsdToEuro = ui.userInputDouble("Please enter exchange rate USD to EURO: ");

        boolean correctChoose = true;
        double amountAfterConvert = 0;


        String message = "Please choose your type of operations: \n"+
                "1. Convert USD to EURO \n"+
                "2. Convert EURO to USD \n";

        while (correctChoose) {

            int choose = ui.userInputInteger(message);

            if (choose == 1) {
                amountAfterConvert = amountAfterConvert("USD", exchangeRateUsdToEuro);
                correctChoose = false;
            } else if (choose == 2) {
                amountAfterConvert = amountAfterConvert("EURO", 1/exchangeRateUsdToEuro);
                 correctChoose = false;
            } else {
                System.out.println("Incorrect choose. Please enter again. ");
                System.out.println("--------------------------------------");
            }

        }

        System.out.println("Amount after converting " + amountAfterConvert);

    }


    public static double amountAfterConvert(String currency, double exchangeRate){
        UserInput ui = new UserInput();
        Converter converter = new Converter();
        double currencyAmount = ui.userInputDouble("Please enter amount of " + currency);
        System.out.println("Source currency " + currencyAmount + " " + currency);
        return converter.converter(currencyAmount,exchangeRate);

    }
}
