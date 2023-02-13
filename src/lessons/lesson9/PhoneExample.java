package lessons.lesson9;

public class PhoneExample {
    public static void main(String[] args) {
        SimCard mySimCard = new SimCard();
        mySimCard.simNumber = 123456;

        Phone iPhoneBlack = new Phone();
        iPhoneBlack.imei = 534876334;
        iPhoneBlack.simCard = mySimCard;

        System.out.println(mySimCard.simNumber);
        System.out.println(iPhoneBlack.imei);
        System.out.println(iPhoneBlack.simCard.simNumber);
    }
}
