package lessons.lesson10.arrayExample;

import java.util.Arrays;

public class Example4Cats {
    public static void main(String[] args) {
        Cat[] array1 = new Cat[5];

        Cat cat1 = new Cat(1,"Lucky");

        //System.out.println(cat1);

        array1[0] = cat1;

        array1[1] = new Cat(2, "Barsik");
        array1[2] = new Cat(3, "Murzik");
        array1[3] = new Cat(4, "Masja");
        array1[4] = new Cat(5, "Dexter");


        System.out.println("array1 - " + array1);

        System.out.println("array1 - " + Arrays.toString(array1));
        System.out.println("===================================");

        for (int index = 0; index < array1.length; index++) {
            System.out.println("array index - " + index + " Cat id - " + array1[index].id + " cat name: " + array1[index].name);
        }

        System.out.println("===================================");

        Cat[] array2 = array1.clone();

        System.out.println(array2);
        System.out.println("array2 - " + Arrays.toString(array2));

        array2[1].name = "Pljusha";
        System.out.println("===================================");

        for (int index = 0; index < array2.length; index++) {
            System.out.println("array2 index - " + index + " Cat id - " + array2[index].id + " cat name: " + array2[index].name);
        }

        System.out.println("===================================");

        for (int index = 0; index < array1.length; index++) {
            System.out.println("array1 index - " + index + " Cat id - " + array1[index].id + " cat name: " + array1[index].name);
        }






    }
}
