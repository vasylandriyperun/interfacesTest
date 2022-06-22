package org.homework.animalWorld;

public class Squirrel extends Animal implements Wild{

    public Squirrel(String name, int age, boolean isABoy, String furColor) {
        super(name, age, isABoy, furColor);
    }

    @Override
    public void displayFavoriteFood() {

    }

    @Override
    public void runAway() {
        System.out.println("I climb a tree");
    }
}
