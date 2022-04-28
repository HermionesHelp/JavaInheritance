package com.company;

public class Weapon extends Item{

    private int damage;

    public Weapon(String name, String description, int buyPrice, int sellPrice, int damage) {
        super(name, description, buyPrice, sellPrice);
        this.damage = damage;
    }

    public String getWeapon() {
        return this.toString() + " You do " + this.damage + " points damage.";
    }
}
