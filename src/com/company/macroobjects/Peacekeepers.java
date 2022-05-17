package com.company.macroobjects;

import com.company.microobjects.peacekeepers.Soldier;

import java.util.List;

public class Peacekeepers {
    List<Soldier> soldiers;

    public Peacekeepers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public void addUnit(Soldier s){
        soldiers.add(s);
    }


    @Override
    public String toString() {
        return "Peacekeepers{" +
                "soldiers=" + soldiers +
                '}';
    }
}
