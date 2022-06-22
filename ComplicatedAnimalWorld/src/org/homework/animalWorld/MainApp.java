package org.homework.animalWorld;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Dog> dogList = createAndFillDogList();
        Squirrel superSquirrel = new Squirrel("Strelka", 6, false, "red");
        Neanderthal boogason = new Neanderthal();
        List<Wild> wildList = new ArrayList<>(dogList);
        wildList.add(superSquirrel);
        wildList.add(boogason);
        for (Wild el : wildList) {
            el.runAway();
        }
    }

    private static List<Hamster> createAndFillNewHamstersSuperList() {
        List<Hamster> resultList = new ArrayList<>();
        resultList.add(new Hamster
                ("Jerry", 1, true, "Brown", false));
        return resultList;
    }

    private static List<Cat> createAndFillCatList() {
        Cat garfield = new Cat("Garfield", 4, "Orange", true);
        Cat tom = new Cat("Tom", 56, "Gray", true);
        Cat murka = new Cat("Murka", 3, "White", false);
        List<Cat> catList = new ArrayList<>();
        catList.add(garfield);
        catList.add(tom);
        catList.add(murka);
        return catList;
    }

    private static List<Dog> createAndFillDogList() {
        Dog caesar = new Dog("Caesar", 12, "Mixed", true, "Woof!");
        Dog patron = new Dog("Patron", true);
        Dog lessie = new Dog("Lessie", false, "Bark!");
        List<Dog> dogList = new ArrayList<>();
        dogList.add(caesar);
        dogList.add(patron);
        dogList.add(lessie);
        return dogList;
    }
}
