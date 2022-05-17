package com.company.macroobjects;

import com.company.microobjects.peacekeepers.Soldier;
import com.company.microobjects.survivors.Fighter;
import com.company.microobjects.zombies.Zombie;

import java.util.List;

public class InfectedCity {
    List<Object> macroObjects;
    List<Soldier> soldiers;
    List<Fighter> fighters;
    List<Zombie> zombies;

    public InfectedCity(List<Object> macroObjects, List<Soldier> soldiers, List<Fighter> fighters, List<Zombie> zombies) {
        this.macroObjects = macroObjects;
        this.soldiers = soldiers;
        this.fighters = fighters;
        this.zombies = zombies;
    }


}
