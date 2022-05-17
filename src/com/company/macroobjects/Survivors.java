package com.company.macroobjects;

import com.company.microobjects.peacekeepers.Soldier;
import com.company.microobjects.survivors.Fighter;

import java.util.List;

public class Survivors {
    List<Fighter> fighters;

    public Survivors(List<Fighter> fighters) {
        this.fighters = fighters;
    }

    public void addUnit(Fighter s) {
        fighters.add(s);
    }

    @Override
    public String toString() {
        return "Survivors{" +
                "fighters=" + fighters +
                '}';
    }
}
