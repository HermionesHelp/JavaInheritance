package com.company;

import java.util.Objects;

public class Item {

    private String name;
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Item (String name, String description, int buyPrice, int sellPrice){
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString(){
        if (this.sellPrice != 0) {
            return "This is a " + this.name + " - " + this.description + ". You can buy this item for " + this.buyPrice + ". Or sell this item for " + this.sellPrice + ".";
        } else{
            return "This is a " + this.name + " - " + this.description + ". You can buy this item for " + this.buyPrice + ". It cannot be sold.";
        }
    }

}
