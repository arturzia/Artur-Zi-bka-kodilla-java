package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idUser;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPost;

    public ForumUser(final int idUser, final String nameUser, final char sex, final LocalDate dateOfBirth, final int numberOfPost) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPost = numberOfPost;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}
