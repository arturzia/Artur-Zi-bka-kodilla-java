package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultsMapOfForum = theForum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(ForumUser -> ForumUser.getNumberOfPost() > 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, ForumUser -> ForumUser));

        theResultsMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + " : "+ entry.getValue())
                .forEach(System.out::println);
    }

}
