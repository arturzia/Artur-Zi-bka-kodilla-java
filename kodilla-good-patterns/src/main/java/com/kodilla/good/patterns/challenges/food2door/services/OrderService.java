package com.kodilla.good.patterns.challenges.food2door.services;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public interface OrderService {
     boolean process(Producer producer, String food, int quantity);
}
