package lessons.lesson9.innerClass;

public class Outer {
    int id;

    class Inner {
        public Inner(int innerNumber) {
            this.innerNumber = innerNumber;
        }

        int innerNumber;
        public void show() {
            System.out.println("In a nested class method" + innerNumber);
        }
    }

}
