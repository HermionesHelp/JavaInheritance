package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Potion potion1 = new Potion("Minor Healing Potion", "Heals minor wounds", 10, 1,15);
        Weapon weapon1 = new Weapon("Wooden Sword", "A Cheap wooden sword", 10, 1, 5);
        Item item1 = new Item("Lucky Stone", "This stone bring you luck on your adventure", 50, 5);

        System.out.println(potion1.getPotion());
        System.out.println(weapon1.getWeapon());
        System.out.println(item1);

    }
}
