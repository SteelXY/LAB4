package com.company.microobjects.peacekeepers;

import java.util.concurrent.ThreadLocalRandom;

public class Soldier {
     String name;
     String base;
     int lvl;
     double health;
     int damage;

    public Soldier(String name, String base, int lvl, double health, int damage) {
        System.out.println("Soldier constructor has been called");
        this.name = name;
        this.base = base;
        this.lvl = lvl;
        this.health = health;
        this.damage = damage;
    }

    public Soldier() {
        this("no name", "base" + ThreadLocalRandom.current().nextInt(1, 3 + 1), 1, ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
    }
    public void attack(){
        System.out.println("I am attacking!");
    }


    @Override
    public String toString() {
        return "Soldier{" +
                "base='" + base + '\'' +
                ", name='" + name + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}