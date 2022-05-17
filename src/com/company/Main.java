package com.company;


import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ArrayList<Soldier> soldierArrayList = new ArrayList<>();
        ArrayList<Commander> commanderArrayList = new ArrayList<>();
        ArrayList<General> generalArrayList = new ArrayList<>();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1 - Додати на i-у позицію у поточний масив новий об’єкт: ");
            System.out.println("2 - Вивести всіх Солдатів");
            System.out.println("3 - Вивести всіх Командирів");
            System.out.println("4 - Вивести всіх Генералів");
            System.out.println("0 - Вихід");
            int option = Integer.parseInt(bufferedReader.readLine());
            switch (option) {
                case (1):
                    System.out.println("Виберіть клас об'єкта: ");
                    System.out.println("1 - Солдат");
                    System.out.println("2 - Командир");
                    System.out.println("3 - Генерал");
                    int option2 = Integer.parseInt(bufferedReader.readLine());

                    switch (option2) {

                        case (1):
                            System.out.println("Введіть позицію i: ");
                            try {
                                int pos = Integer.parseInt(bufferedReader.readLine());

                                System.out.println("Введіть ім'я об'єкту: ");
                                String name = bufferedReader.readLine();
                                System.out.println("Введіть базу об'єкту: ");
                                String base = bufferedReader.readLine();
                                System.out.println("Введіть lvl об'єкту: ");
                                int lvl = Integer.parseInt(bufferedReader.readLine());
                                System.out.println("Введіть health об'єкту: ");
                                double health = Double.parseDouble(bufferedReader.readLine());
                                System.out.println("Введіть damage об'єкту: ");
                                int damage = Integer.parseInt(bufferedReader.readLine());
                                soldierArrayList.add(pos, new Soldier(name, base, lvl, health, damage));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                        case (2):
                            System.out.println("Введіть позицію i: ");
                            try {
                                int pos = Integer.parseInt(bufferedReader.readLine());

                                System.out.println("Введіть ім'я об'єкту: ");
                                String name = bufferedReader.readLine();
                                System.out.println("Введіть базу об'єкту: ");
                                String base = bufferedReader.readLine();
                                System.out.println("Введіть lvl об'єкту: ");
                                int lvl = Integer.parseInt(bufferedReader.readLine());
                                System.out.println("Введіть health об'єкту: ");
                                double health = Double.parseDouble(bufferedReader.readLine());
                                System.out.println("Введіть damage об'єкту: ");
                                int damage = Integer.parseInt(bufferedReader.readLine());
                                commanderArrayList.add(pos, new Commander(name, base, lvl, health, damage));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                        case (3):
                            System.out.println("Введіть позицію i: ");
                            try {
                                int pos = Integer.parseInt(bufferedReader.readLine());

                                System.out.println("Введіть ім'я об'єкту: ");
                                String name = bufferedReader.readLine();
                                System.out.println("Введіть базу об'єкту: ");
                                String base = bufferedReader.readLine();
                                System.out.println("Введіть lvl об'єкту: ");
                                int lvl = Integer.parseInt(bufferedReader.readLine());
                                System.out.println("Введіть health об'єкту: ");
                                double health = Double.parseDouble(bufferedReader.readLine());
                                System.out.println("Введіть damage об'єкту: ");
                                int damage = Integer.parseInt(bufferedReader.readLine());
                                generalArrayList.add(pos, new General(name, base, lvl, health, damage));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                    }
                    break;
                case (2):
                    for (int i = 0; i < soldierArrayList.size(); i++) {
                        System.out.println(soldierArrayList.get(i));
                    }
                    break;
                case (3):
                    for (int i = 0; i < commanderArrayList.size(); i++) {
                        System.out.println(commanderArrayList.get(i));
                    }
                    break;
                case (4):
                    for (int i = 0; i < generalArrayList.size(); i++) {
                        System.out.println(generalArrayList.get(i));
                    }
                    break;
                case (0):
                    isRunning = false;
                    break;
            }
        }
    }
}
