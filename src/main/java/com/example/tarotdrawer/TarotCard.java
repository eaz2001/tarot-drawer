package com.example.tarotdrawer;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TarotCard {
    @JsonProperty("name") private String name;
    @JsonProperty("rank") private String rank;
    @JsonProperty("suit") private String suit;
    @JsonProperty("keywords") private String[] keywords;
    @JsonProperty("meanings") private Map<String, String[]> meanings;
    @JsonProperty("fortune_telling") private String[] fortunes;

    public TarotCard(){}

    public String toString(){
        return name;
    }
}
