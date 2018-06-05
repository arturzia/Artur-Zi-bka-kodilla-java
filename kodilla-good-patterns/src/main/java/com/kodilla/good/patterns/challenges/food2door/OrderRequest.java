package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {

    private Producer producer;
    private String food;
    private int quantity;

    public OrderRequest(Producer producer, String food, int quantity) {
        this.producer = producer;
        this.food = food;
        this.quantity = quantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }
}
