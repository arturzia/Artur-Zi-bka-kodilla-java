package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.Food;
import com.kodilla.good.patterns.challenges.food2door.Producer;

public class OrderRequestRetrieverHealthy {

    public OrderRequest retrieve(){

        Producer ExtraFood = new Producer("HelthyShop",
                23459,
                "helthyfood@gmail.com",
                "King Street 20, London");

        Food food = new Food("fish", 100);

        return new OrderRequest(ExtraFood, food.getNameFood(), food.getQuantityFood());
    }
}
