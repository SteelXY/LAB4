package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class General {
    private String name;
    private String base;
    private int lvl;
    private double health;
    private int damage;
    public static int sortType = 0;

    public General(int lvl) {
    }

    public General(String name, String base, int lvl, double health, int damage) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public General(String name, String base, int lvl, double health) {
        System.out.println("General constructor has been called");
        System.out.println("name: " + name + ", base: " + base + ", lvl: " + lvl + ", health: " + health + ", damage: " + damage);
        this.name = name;
        this.base = base;
        this.lvl = lvl;
        this.health = health;
        this.damage = damage;
    }

    public General() {
        this("no name", "base" + ThreadLocalRandom.current().nextInt(1, 3 + 1), ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
    }

    @Override
    public String toString() {
        return "General{" +
                "name='" + name + '\'' +
                ", base='" + base + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
