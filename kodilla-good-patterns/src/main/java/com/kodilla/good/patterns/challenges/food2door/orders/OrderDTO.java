package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public class OrderDTO {
    private Producer producer;
    private boolean isOrdered;

    public OrderDTO(Producer producer, boolean isOrdered) {
        this.producer = producer;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
}
