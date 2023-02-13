package lessons.lesson9.randomStudent;

public class Students {

    int numberOfStudents;

    public int chooseRandomStudent(){
        int max = numberOfStudents;
        int min = 1;
        int randomStudentNumber = (int) (min + Math.random()*((max - min) +1));

        // 0 - 100   -> Math.random() * (100+1) - Math.random возвращает значение от 0 до 0.99999

        return randomStudentNumber;
    }
}
