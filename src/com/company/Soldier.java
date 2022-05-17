package com.company;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Soldier /*implements Comparable<Soldier>, Cloneable*/ {
    private String name;
    private String base;
    private int lvl;
    private double health;
    private int damage;
    public static int sortType = 0;

    public Soldier(int lvl) {
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

    public Soldier(String name, String base, int lvl, double health, int damage) {
        System.out.println("Soldier constructor has been called");
        System.out.println("name: " + name + ", base: " + base + ", lvl: " + lvl + ", health: " + health + ", damage: " + damage);
        this.name = name;
        this.base = base;
        this.lvl = lvl;
        this.health = health;
        this.damage = damage;
    }

    public Soldier() {
        this("no name", "base" + ThreadLocalRandom.current().nextInt(1, 3 + 1), ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(0, 100 + 1), ThreadLocalRandom.current().nextInt(25, 50 + 1));
    }


    public void run() {
        System.out.println("I am running");
    }

    public void attack() {
        System.out.println("I am attacking");
    }

    public void heal() {
        System.out.println("I am healling");
        if (health < 100) {
            health++;
        }
    }

    public void cover() {
        System.out.println("I am covering");
    }

    public void print() {
        System.out.println(this);
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


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Soldier soldier = (Soldier) o;
//        return lvl == soldier.lvl && Double.compare(soldier.health, health) == 0 && Objects.equals(name, soldier.name) && Objects.equals(base, soldier.base);
//    }
//
//    static {
//        System.out.println("Static");
//    }
//
//    {
//        System.out.println("Non-static block");
//    }
//
//    @Override
//    public int compareTo(Soldier soldier2) {
//        if (Soldier.sortType == 0) {
//            return Integer.compare(this.lvl, soldier2.lvl);
//        } else return this.base.compareTo(soldier2.base);
//    }
//
//
//    @Override
//    public Soldier clone() {
//        try {
//            return (Soldier) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}