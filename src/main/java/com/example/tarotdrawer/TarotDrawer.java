package com.example.tarotdrawer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TarotDrawer {
    public static void main(String[] args) {
        File tarotData = new File("src\\main\\java\\com\\example\\tarotdrawer\\data\\tarot_cards.json");
        ObjectMapper om = new ObjectMapper();
        TarotCard[] cards = {};
        try {
            cards = om.readValue(tarotData, TarotCard[].class);
        }
        catch(IOException e){
            System.out.println(e);
        }

        int cardNum = (int) (Math.random() * 78);
        if(Math.random() >= .5){
            System.out.print("Reversed ");
        }
        System.out.println(cards[cardNum]);
    }
}