package lessons.lesson17;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {
        String myString = "I love Java!";
        String myString2 = "I love Java too!";

        String[] myStringArray = {myString, myString2};
        System.out.println(myStringArray);
        myString = myString + myString2 + "!!!";

        System.out.println(Arrays.toString(myStringArray));

        System.out.println(myString + " " + myString);

        // ----------------------- StringBuffer---------

        String stringLikeStringBuffer = 1 + 2 + ";" + false + " ;" + (1 + 2) + ";";
        System.out.println(stringLikeStringBuffer);

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(";");
        stringBuffer.append(false);
        stringBuffer.append(";");
        stringBuffer.append(2);
        stringBuffer.append("1");
        stringBuffer.append(";");

        System.out.println(stringBuffer);

        /*
        append()
        insert()
        delete()
        reverse()

        int indexOf()
        int capacity()

        replace(int start, int end, String str)

        int length()


         */


        StringBuffer stringBuffer1 = new StringBuffer(); // + ""
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer1.length());

        stringBuffer1.append("012345");
        stringBuffer1.append("67890");
        stringBuffer1.append("1234");
        stringBuffer1.append("5678");

        System.out.println(stringBuffer1);

        System.out.println(stringBuffer1.length());
        System.out.println(stringBuffer1.capacity());
        stringBuffer1.trimToSize();
        System.out.println(stringBuffer1.capacity());


        System.out.println(stringBuffer1.substring(3));
        System.out.println(stringBuffer1.substring(4,8));
        System.out.println(stringBuffer1.replace(3,5,"ABCDEFGHI"));
        System.out.println(stringBuffer1.reverse());

        System.out.println(stringBuffer1);


    }
}
