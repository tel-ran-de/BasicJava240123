package lessons.lesson14.poker.entity;

import lessons.lesson14.poker.entity.Card;

public class Player {
    public String name;
    public Card[] playersCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

}
