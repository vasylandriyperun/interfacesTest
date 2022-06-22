package org.homework.animalWorld;

public class Hamster extends Animal implements Homey {

    private boolean hasACage;

    public Hamster(String name, int age, boolean isABoy, String furColor, boolean hasACage) {
        super(name, age, isABoy, furColor);
        this.hasACage = hasACage;
    }

    public boolean isHasACage() {
        return hasACage;
    }

    public void setHasACage(boolean hasACage) {
        this.hasACage = hasACage;
    }

    @Override
    public void displayFavoriteFood() {

    }
}
