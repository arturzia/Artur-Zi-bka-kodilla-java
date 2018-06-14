package com.kodilla.good.patterns.challenges.food2door.repository;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public interface OrderRepository {
    public boolean createOrder(Producer producer, String food, int quantity);
}
