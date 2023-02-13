package lessons.lesson9.innerClass;

public class OuterAndInnerDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner(1);
        in.show();

    }
}
