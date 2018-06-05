package com.kodilla.good.patterns.challenges.food2door;

public class Food {

    private String nameFood;
    private int quantityFood;

    public Food(String nameFood, int quantityFood) {
        this.nameFood = nameFood;
        this.quantityFood = quantityFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public int getQuantityFood() {
        return quantityFood;
    }
}
