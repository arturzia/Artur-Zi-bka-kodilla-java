package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderRepository implements OrderRepository {
    public boolean createOrder(Producer producer, String food, int quantity){

        System.out.println("Order created --> Food name: "+food+ " Quantity: "+quantity+", Producer: "+producer.getName());

        return true;
    }
}
