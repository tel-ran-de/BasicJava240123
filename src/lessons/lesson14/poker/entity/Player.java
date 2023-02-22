package lessons.lesson14.poker.entity;

public class Player {
    public String name;
    public Card[] playersCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

}
