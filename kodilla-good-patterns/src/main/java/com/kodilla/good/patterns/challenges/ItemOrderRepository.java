package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ItemOrderRepository implements OrderRepository{

    public boolean createOrder(User user, LocalDate date, int orderId){

        System.out.println("Order created --> order Id: "+orderId+ ", date of order: "
                +date+", User: "+user.getName()+" "+user.getSurname());

        return true;

    }
}
