package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate date;
    private int orderId;

    public OrderRequest(User user, LocalDate date, int orderId) {
        this.user = user;
        this.date = date;
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getOrderId() {
        return orderId;
    }
}
