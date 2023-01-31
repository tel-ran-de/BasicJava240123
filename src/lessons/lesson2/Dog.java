package lessons.lesson2;

public class Dog {
    String name;
    int age;
    String breed;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
