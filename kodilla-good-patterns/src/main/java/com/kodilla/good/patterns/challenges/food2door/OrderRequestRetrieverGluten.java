package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetrieverGluten {
    public OrderRequest retrieve(){

        Producer ExtraFood = new Producer("GlutenFreeShop",
                45934,
                "glutenfreefood@gmail.com",
                "Czarnowiejska 30, Krakow");

        Food food = new Food("bread", 30);

        return new OrderRequest(ExtraFood, food.getNameFood(), food.getQuantityFood());
    }
}
