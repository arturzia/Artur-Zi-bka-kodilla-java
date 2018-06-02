package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ItemOrderService implements OrderService {

    public boolean order(User user, LocalDate date, int orderId){

        System.out.println("OrderId: "+orderId+" "+user.getName()+" "+user.getSurname()+" "+ date.toString());

        return true;

    }
}
