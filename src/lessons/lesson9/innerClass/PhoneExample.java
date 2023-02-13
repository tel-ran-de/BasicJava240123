package lessons.lesson9.innerClass;

import lessons.lesson9.SimCard;

public class PhoneExample {
    public static void main(String[] args) {


        PhoneWithInner iPhoneBlack = new PhoneWithInner();

        PhoneWithInner.SimInner simInner = new PhoneWithInner().new SimInner();

        simInner.simInner = 789456;



        iPhoneBlack.imei = 534876334;

        System.out.println(iPhoneBlack);
        System.out.println(simInner);



    }
}
