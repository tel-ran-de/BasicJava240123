package lessons.lesson3.dogExample;

public class Dog {
    String name;
    int age;

    public void voice(){
//        int age = 5; - переменная "локальная" имеет приоритет
        System.out.println("Gav!!!");
        System.out.println("My age " + age);
    }

    public void say(String textMessage){
        System.out.println(textMessage);
    }

}
