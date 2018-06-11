package com.kodilla.good.patterns.challenges.food2door;

public interface OrderService {
    public boolean process(Producer producer, String food, int quantity);
}
