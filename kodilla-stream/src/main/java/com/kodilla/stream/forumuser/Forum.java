package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsers = new ArrayList<>();

    public Forum() {
        theForumUsers.add(new ForumUser(1001, "John", 'M', LocalDate.of(1997,8,13), 100));
        theForumUsers.add(new ForumUser(1002, "Debra", 'F', LocalDate.of(1999,6,23), 10));
        theForumUsers.add(new ForumUser(1003, "Artur", 'M', LocalDate.of(2002,1,3), 1000));
        theForumUsers.add(new ForumUser(1004, "Frank", 'M', LocalDate.of(2001,2,11), 36));
        theForumUsers.add(new ForumUser(1005, "Anna", 'F', LocalDate.of(2005,4,28), 325));
        theForumUsers.add(new ForumUser(1006, "Daria", 'F', LocalDate.of(2003,9,30), 178));
        theForumUsers.add(new ForumUser(1007, "Gregory", 'M', LocalDate.of(1995,3,29), 278));
        theForumUsers.add(new ForumUser(1008, "Albert", 'M', LocalDate.of(1987,7,13), 524));
        theForumUsers.add(new ForumUser(1009, "JohnD", 'M', LocalDate.of(1978,8,4), 32));
        theForumUsers.add(new ForumUser(1010, "Ela", 'F', LocalDate.of(1988,5,11), 188));
    }

    public List<ForumUser> getUserList(){

        return new ArrayList<>(theForumUsers);
    }
}
