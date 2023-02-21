package lessons.lesson14.poker.entity;

import lessons.lesson11.entity.Car;

public class Cards {
    /*
    создаем массив из элементов-экземпляров класса Card
    в каждой ячейке этого массива будет хранится ссылка на элемент-экземпляр класса Card
    у которого есть две переменные - value и suit
     */

    public Card[] deck = new Card[52];
    public Card[] deckShuffle = new Card[52];

    public void createDeck(){

        String[] cardValue = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cardSuit = {"♠️","♣️","♦️","♥️"};

        int counter = 0;

        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
             deck[counter] = new Card(cardValue[i], cardSuit[j]);
             counter++;
            }
        }
    }

    public void deckShuffle(Card[] myDeck){
        deckShuffle = myDeck.clone();

        for (int i = deckShuffle.length-1; i > 1 ; i--) {
            int j = (int) (Math.random() * i);

            Card tempCard = deckShuffle[i];
            deckShuffle[i] = deckShuffle[j];
            deckShuffle[j] = tempCard;
        }
    }

    public void printDeck(Card[] workingDeck, String message){
        System.out.println(message);

        int counter = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                //System.out.print(workingDeck[counter] + ", ");
                System.out.print(workingDeck[counter].value+workingDeck[counter].suit + ", ");
                counter++;
            }
            System.out.println();
        }
    }

}
