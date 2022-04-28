package com.company;

public class Potion extends Item {

    private int healAmount;

    public Potion(String name, String description, int buyPrice, int sellPrice, int healAmount) {
        super(name, description, buyPrice, sellPrice);
        this.healAmount = healAmount;
    }

    public String getPotion() {
        return this.toString() + " This potion heals you for " + this.healAmount + ".";
    }

}
