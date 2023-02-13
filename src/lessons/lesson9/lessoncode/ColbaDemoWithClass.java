package lessons.lesson9.lessoncode;

public class ColbaDemoWithClass {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        Colba colba = new Colba(100,100);

        colba.setTemp1(ui.userInputInteger("Please enter first flask temp - "));

        int temp2 = ui.userInputInteger("Please enter second flask temp - ");
        colba.setTemp2(temp2);

        colba.printCheckResult();

        //Colba colba = new Colba(temp1,temp2);
    }
}
