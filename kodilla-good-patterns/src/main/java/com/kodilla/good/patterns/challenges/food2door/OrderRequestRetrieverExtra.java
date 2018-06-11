package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetrieverExtra {
    public OrderRequest retrieve(){

        Producer ExtraFood = new Producer("ExtraFoodShop",
                125369,
                "extrafood@gmail.com",
                "Baker Street 30, London");

        Food food = new Food("egg", 1250);

        return new OrderRequest(ExtraFood, food.getNameFood(), food.getQuantityFood());
    }
}
