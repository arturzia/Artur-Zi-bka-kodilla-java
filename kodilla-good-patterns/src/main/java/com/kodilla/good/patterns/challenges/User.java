package com.kodilla.good.patterns.challenges;

public class User {

    public String name;
    public String surname;
    public int userId;
    public String userMail;
    private String userAddress;

    public User(String name, String surname, int userId, String userMail, String userAdress) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
        this.userMail = userMail;
        this.userAddress = userAdress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserAdress() {
        return userAddress;
    }
}