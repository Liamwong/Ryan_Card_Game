package com.personal.cardGame;

public class Card {

    public int value;
    public String suite;

    public Card(int val, String su){
        this.value = val;
        this.suite = su;
    }

    public void setValue(int val){
        this.value = val;
    }

    public void setSuite(String suite){
        this.suite = suite;
    }

    public int getValue(){
        return this.value;
    }

    public String getSuite(){
        return this.suite;
    }




}
