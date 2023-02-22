package lessons.lesson14.poker.entity;

public class Card {
    public String value;
    public String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value  + suit  ;
    }
}
