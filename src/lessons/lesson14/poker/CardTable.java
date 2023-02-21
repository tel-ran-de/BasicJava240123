package lessons.lesson14.poker;

import lessons.lesson14.poker.entity.Cards;

public class CardTable {

    Cards cards = new Cards();

    int numberCardsForEachPlayer = 5;

public void game(){

    cards.createDeck();
    cards.printDeck(cards.deck, "----------- Create New Deck -----------");

    cards.deckShuffle(cards.deck);

    cards.printDeck(cards.deckShuffle, "--------- Deck after shuffle --------");

}

}
