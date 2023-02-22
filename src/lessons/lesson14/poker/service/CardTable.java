package lessons.lesson14.poker.service;

import lessons.lesson14.poker.utils.CardTableUtil;
import lessons.lesson14.poker.entity.Cards;

public class CardTable {
   Cards cards = new Cards();
   CardTableUtil cardTableUtil= new CardTableUtil();

    int numberCardsForEachPlayer = 5;

public void game(){

    cards.createDeck();
    cards.printDeck(cards.deck, "----------- Create New Deck -----------");

    cards.deckShuffle(cards.deck);

    cards.printDeck(cards.deckShuffle, "--------- Deck after shuffle --------");

    cardTableUtil.createPlayers();
    cardTableUtil.dealCards(cards.deckShuffle, numberCardsForEachPlayer);
    cardTableUtil.printPlayers();

    }


}
