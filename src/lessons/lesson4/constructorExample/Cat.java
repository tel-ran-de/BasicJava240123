package lessons.lesson4.constructorExample;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(){

    }



    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }
}
