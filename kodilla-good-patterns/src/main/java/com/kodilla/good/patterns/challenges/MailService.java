package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    public void inform(User user){

        System.out.println("Sent information to mail: "+user.getUserMail());
        System.out.println(user.getName()+" "+user.getSurname()+", UserId: "+user.getUserId() +" --> order accepted");
        System.out.println("Sent item to address: "+user.getUserAdress());
    }
}
