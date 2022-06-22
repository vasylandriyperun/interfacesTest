package org.homework.animalWorld;

public class Cat extends Animal implements Homey{
    private int livesRemaining;


    public Cat(String name, int age, String furColor, boolean isABoy) {
        super(name, age, isABoy, furColor);
        this.livesRemaining = 9;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }

    public void killMe() {
        if (livesRemaining > 0)
            livesRemaining--;
    }

    public void killMe(int n) {
        if (n > 0)
            livesRemaining -= n;
        if (livesRemaining < 0)
            livesRemaining = 0;
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public void displayFavoriteFood() {
        meow();
        System.out.println("Fish");
    }
}
