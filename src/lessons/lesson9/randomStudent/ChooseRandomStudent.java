package lessons.lesson9.randomStudent;

import lessons.lesson9.lessoncode.UserInput;

public class ChooseRandomStudent {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        Students students = new Students();

        students.numberOfStudents = ui.userInputInteger("Please enter the number of students (>  2) attending the lecture: ");

//        for (int i = 0; i < 100; i++) {
//            System.out.println("Random student number is: "  + students.chooseRandomStudent());
//        }

        System.out.println("Random student number is: "  + students.chooseRandomStudent());




    }
}
