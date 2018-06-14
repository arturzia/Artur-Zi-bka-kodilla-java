package com.kodilla.good.patterns.challenges.food2door.services;

import com.kodilla.good.patterns.challenges.food2door.Producer;

public class MailService implements InformationService {
    public void inform(Producer producer){

        System.out.println("Sent information to mail: "+producer.getProducerMail());
        System.out.println(producer.getName()+", ProducerId: "+producer.getProducerId() +" --> order accepted");
        System.out.println("Sent item to address: "+producer.getProducetAddress());
    }
}
