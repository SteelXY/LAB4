package com.company;

import com.company.macroobjects.InfectedCity;
import com.company.macroobjects.Peacekeepers;
import com.company.macroobjects.Survivors;
import com.company.macroobjects.WaterStation;
import com.company.microobjects.peacekeepers.Commander;
import com.company.microobjects.peacekeepers.General;
import com.company.microobjects.peacekeepers.Soldier;
import com.company.microobjects.survivors.Chief;
import com.company.microobjects.survivors.Fighter;
import com.company.microobjects.survivors.Sheriff;
import com.company.microobjects.zombies.Golliwog;
import com.company.microobjects.zombies.Volatile;
import com.company.microobjects.zombies.Zombie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Soldier soldier1 = new Soldier();
        System.out.println(soldier1);
        Soldier soldier2 = new Soldier();
        System.out.println(soldier2);
        Commander commander1 = new Commander();
        System.out.println(commander1);
        General general1 = new General();
        System.out.println(general1);

        general1.attack(); //виклик методу базового класу

        List<Soldier> army = new ArrayList<>();
        army.add(soldier1);
        army.add(commander1);
        army.add(general1);
        Peacekeepers peacekeepersBase = new Peacekeepers(army);
        System.out.println("Peacekeepers = " + peacekeepersBase);

        peacekeepersBase.addUnit(soldier2);
        System.out.println("Peacekeepers = " + peacekeepersBase); // кількість мікрооб'єктів збільшується протягом роботи програми

        List<Fighter> fighters = new ArrayList<>();
        fighters.add(new Fighter());
        fighters.add(new Sheriff());
        fighters.add(new Chief());
        Survivors survivors = new Survivors(fighters);

        List<Zombie> zombies = new ArrayList<>();
        zombies.add(new Zombie());
        zombies.add(new Golliwog());
        zombies.add(new Volatile());
        WaterStation waterStation = new WaterStation(zombies);

        InfectedCity infectedCity = new InfectedCity(Arrays.asList(peacekeepersBase, survivors, waterStation), army, fighters, zombies);

    }
}
