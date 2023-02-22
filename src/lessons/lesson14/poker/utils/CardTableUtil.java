package lessons.lesson14.poker.utils;

import lessons.lesson14.poker.entity.Card;
import lessons.lesson14.poker.entity.Player;
import lessons.lesson14.poker.service.InputData;

import java.util.Arrays;

public class CardTableUtil {
    InputData iData = new InputData();
    public int numberOfPayers = iData.enterNumberOfPlayers();
    public Player[] players = new Player[numberOfPayers];



    public void createPlayers(){
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Players # " + (i+1));
        }
    }


    public void dealCards(Card[] deck, int numberCardsForEachPlayers){
        int counter = 0 ;
        for (int i = 0; i < numberCardsForEachPlayers; i++) {
            for (int j = 0; j < numberOfPayers; j++) {
                players[j].playersCards[i] = deck[counter];
                counter++;
            }

        }
    }

    public void printPlayers(){


        for (int i = 0; i < players.length; i++) {
            System.out.println("------" + players[i].name + "--------------");
            printCard(players[i].playersCards);
            System.out.println();
        }
    }

    public void printCard(Card[] cards){
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i].value + cards[i].suit + ", " );
        }
    }

    public void cleanDeck(Card[] deck, int numberCardsForEachPlayers){
        Card emptyCardReference = new Card(" ", " ");
        for (int i = 0; i < (numberCardsForEachPlayers*numberOfPayers); i++) {
            deck[i] = emptyCardReference;
        }
    }
}
