package lessons.lesson14_15.poker.logic;

import lessons.lesson14_15.poker.service.CardTableUtil;
import lessons.lesson14_15.poker.entity.Cards;

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
    cardTableUtil.cleanDeck(cards.deckShuffle, numberCardsForEachPlayer);

    cards.printDeck(cards.deckShuffle, "--------- Deck after deal --------");

    cardTableUtil.printPlayers();


}


}
