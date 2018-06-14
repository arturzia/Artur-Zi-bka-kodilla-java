package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.Food;
import com.kodilla.good.patterns.challenges.food2door.Producer;

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
