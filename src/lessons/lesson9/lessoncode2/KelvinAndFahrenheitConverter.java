package lessons.lesson9.lessoncode2;

public class KelvinAndFahrenheitConverter {

    public double KelvinConverter(double celsiusValue){
        return celsiusValue + 273.15;
    }

    public double FahrenheitConverter(double  celsiusValue){
        return celsiusValue*1.8 + 32;
    }

}
