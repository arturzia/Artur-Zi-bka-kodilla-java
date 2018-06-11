package com.kodilla.good.patterns.challenges.food2door;

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

    public boolean isIsOrdered() {
        return isOrdered;
    }
}
