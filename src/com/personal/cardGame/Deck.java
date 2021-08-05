package com.personal.cardGame;

import java.util.ArrayList;
import com.personal.cardGame.Card;
import java.util.Random;

public class Deck {

    public ArrayList<Card> cards;
//    private ArrayList<Integer> indices = new ArrayList<>();



    public Deck(){
        cards = new ArrayList<Card>();
        String[] suites = new String[] {"hearts", "spades", "clubs", "diamonds"};
        for(int i = 0; i < 4; i++){
            for(int j = 2; j <= 13; j++){
                Card c = new Card(j, suites[i]);
//                System.out.println(j + " of " + c.suite);
                this.cards.add(c);
            }
        }
//        for(int i = 0; i < 52; i++){
//            indices.add(i);
//        }
    }

    public Card drawCard(){
        Card c = this.cards.get(this.cards.size() - 1);
        this.cards.remove(this.cards.size() - 1);
        return c;
    }

    public void shuffle(){
        Random rand = new Random();
        ArrayList<Card> og = this.cards;
        ArrayList<Card> replacement = new ArrayList<>();
        while(og.size() > 0){
            int idx = rand.ints(0, og.size()).findFirst().getAsInt();
            Card c = og.get(idx);
            replacement.add(c);
            og.remove(idx);
        }
//        int randomIdx = rand.ints(0, );
        this.cards = replacement;
//        return replacement;
    }


    public void printDeck(){
        for(int i = 0; i < this.cards.size(); i++){
            System.out.println(this.cards.get(i).value + " of " + this.cards.get(i).suite);
        }
    }

}


