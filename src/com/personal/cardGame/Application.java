package com.personal.cardGame;
import com.personal.cardGame.Card;
import com.personal.cardGame.Deck;

public class Application {



    public static void main(String[] args){
        System.out.println("TEST");

        // testing output for Card objects
//        Card sevenHearts = new Card(7, "hearts");
//        Card sixHearts = new Card(6, "hearts");
//        System.out.println(sevenHearts.getValue());

        // testing output for Deck object




        Deck deck = new Deck();
        deck.printDeck();

        deck.shuffle();
        System.out.println('\n');
        deck.printDeck();


    }


}
