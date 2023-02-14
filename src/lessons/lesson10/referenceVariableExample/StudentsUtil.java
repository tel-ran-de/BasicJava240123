package lessons.lesson10.referenceVariableExample;

public class StudentsUtil {

    public void fillPersons(Person[] persons){
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person("Person"+ i,18);
        }
    }

    public void fillAddress(Address[] addresses){
        for (int i = 0; i < addresses.length; i++) {
            addresses[i] = new Address(i, "Berlin", "Address #"+ i,i+10);
        }
    }

    public void fillStudents(Student[] students, Person[] persons, Address[] addresses){
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i,persons[i],addresses[i],"group #1","+49"+i*5742);
        }
    }
}
