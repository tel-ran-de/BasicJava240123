package lessons.lesson10.referenceVariableExample;

public class Student {
    int id;
    Person person;

    Address address;

    String group;

    String phoneNumber;

    public Student(int id, Person person, Address address, String group, String phoneNumber) {
        this.id = id;
        this.person = person;
        this.address = address;
        this.group = group;
        this.phoneNumber = phoneNumber;
    }
}
