package com.kodilla.good.patterns.challenges;

import java.time.*;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John",
                "Brown",
                125369,
                "john.brown@gmail.com",
                "Baker Street 30, London");

        LocalDate dateOfOrder = LocalDate.of(2018, 2, 25);
        int orderId = 2589255;

        return new OrderRequest(user, dateOfOrder, orderId);
    }
}
