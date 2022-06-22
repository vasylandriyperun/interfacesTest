package org.homework.animalWorld;

public abstract class Animal {
    private String name;
    private int age;
    private boolean isABoy;
    private String furColor;

    public Animal(String name, boolean isABoy) {
        this.name = name;
        this.isABoy = isABoy;
    }

    public Animal(String name, int age, boolean isABoy, String furColor) {
        this.name = name;
        this.age = age;
        this.isABoy = isABoy;
        setFurColor(furColor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age)
            this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        if (furColor.length() > 2)
            this.furColor = furColor;
        else if (this.furColor == null)
            this.furColor = "Mutny";
    }

    public boolean isABoy() {
        return isABoy;
    }

    public String getSex() {
        if (isABoy) {
            return "Boy";
        }
        return "Girl";
    }

    public abstract void displayFavoriteFood();
}
