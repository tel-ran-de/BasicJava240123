package lessons.lesson20;

public class StringOperationsExample {
    public static void main(String[] args) {

        String str = "";

        String[] strArray = {"a","b","c","d","e","f","g","h","i","j","k",
                "l","m","n","o","p","q","r","s","t","u",
                "v","w","x","y","z"};

        long  currentTime= System.currentTimeMillis();

        for (int i = 0; i < 40000; i++) {
            for (int j = 0; j < 24; j++) {
                str =  strArray[j] + str;
            }
        }

        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime= System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < 40000; i++) {
            for (int j = 0; j < 24; j++) {
                stringBuffer.append(strArray[j]);
            }
        }
        System.out.println(System.currentTimeMillis() - currentTime);

    }
}
