package lessons.lesson9.lessoncode2;

public class TermoConverterDemo {
    public static void main(String[] args) {
        KelvinAndFahrenheitConverter tempConverter = new KelvinAndFahrenheitConverter();

        System.out.println("Celsius temp 100 degrees is " + tempConverter.KelvinConverter(100) + " Kelvin degrees");
        System.out.println("Celsius temp 100 degrees is " + tempConverter.FahrenheitConverter(100) + " Fahrenheit degrees");

    }
}
