package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopService implements OrderService {

    public boolean process(Producer producer, String food, int quantity){

        System.out.println("Producer name: "+producer.getName()+" --> ORDER ACCEPTED");
        return true;
    }
}
