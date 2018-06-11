package com.kodilla.good.patterns.challenges.food2door;

public interface OrderRepository {
    public boolean createOrder(Producer producer, String food, int quantity);
}
