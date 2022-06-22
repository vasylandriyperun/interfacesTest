package org.homework.animalWorld;

public class Dog extends Animal implements Homey, Wild{

    private String barkSound;

    public Dog(String name, boolean isABoy, String barkSound) {
        super(name,isABoy);
        this.barkSound = barkSound;
    }

    public Dog(String name, boolean isABoy) {
        super(name,isABoy);
    }

    @Override
    public void displayFavoriteFood() {

    }

    public Dog(String name, int age, String furColor, boolean isABoy, String barkSound) {
        super(name, age, isABoy, furColor);
        this.barkSound = barkSound;
    }

    public String getBarkSound() {
        return barkSound;
    }

    public void setBarkSound(String barkSound) {
        this.barkSound = barkSound;
    }

    @Override
    public void runAway() {
        System.out.println("I " +"+ run into fields " + getBarkSound());
    }
}
