package lessons.lesson10.referenceVariableExample;

public class StudentsDataBase {
    public static void main(String[] args) {

        StudentsUtil studentsUtil = new StudentsUtil();


        Person[] persons = new Person[7];
        Address[] addresses = new Address[7];

        studentsUtil.fillPersons(persons);

        for (int i = 0; i < persons.length; i++) {
           // System.out.println(persons[i].name + ", " + persons[i].age);
            System.out.println(persons[i]);
        }

        studentsUtil.fillAddress(addresses);

        for (int i = 0; i < addresses.length; i++) {
            System.out.println(addresses[i].index + ", " + addresses[i].town + ", "   + addresses[i].street + ", " + addresses[i].house);
        }



        Student[] ourStudents = new Student[5];

        studentsUtil.fillStudents(ourStudents,persons,addresses);

        for (int i = 0; i < ourStudents.length; i++) {
            System.out.println(ourStudents[i].id + ", " + ourStudents[i].person.name + ", "   + ourStudents[i].address.street + ", " + ourStudents[i].group + ", " + ourStudents[i].phoneNumber);
        }





    }

}
