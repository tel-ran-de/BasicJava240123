package lessons.lesson9.lessoncode;

public class ColbaDemo {
    public static void main(String[] args) {
        int t1 = 10;
        int t2 = 90;

        System.out.println("Your system is work corrector - " + checkTemp(t1,t2) );


    }

    public static boolean checkTemp(int t1, int t2){
        return (t1 > 100) && (t2 < 100);
    }
}
