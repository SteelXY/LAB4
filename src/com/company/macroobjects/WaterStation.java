package com.company.macroobjects;

import com.company.microobjects.zombies.Zombie;

import java.util.List;

public class WaterStation {
    List<Zombie> zombies;

    public WaterStation(List<Zombie> zombies) {
        this.zombies = zombies;
    }

    public void addUnit(Zombie s) {
        zombies.add(s);
    }

    @Override
    public String toString() {
        return "WaterStation{" +
                "zombies=" + zombies +
                '}';
    }
}