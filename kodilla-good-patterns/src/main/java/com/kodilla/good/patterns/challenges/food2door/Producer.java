package com.kodilla.good.patterns.challenges.food2door;

public class Producer {

    private String name;
    private int producerId;
    public String producerMail;
    private String producerAddress;

    public Producer(String name, int producerId, String producerMail, String producetAddress) {
        this.name = name;
        this.producerId = producerId;
        this.producerMail = producerMail;
        this.producerAddress = producetAddress;
    }

    public String getName() {
        return name;
    }

    public int getProducerId() {
        return producerId;
    }

    public String getProducerMail() {
        return producerMail;
    }

    public String getProducetAddress() {
        return producerAddress;
    }
}
