package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTaskTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTask johnNowak = new StudentTask("John Nowak");
        StudentTask jamesKowalski = new StudentTask("James Kowalski");
        StudentTask lindaSmith = new StudentTask("Linda Smith");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        johnNowak.registerObserver(mentor1);
        jamesKowalski.registerObserver(mentor2);
        lindaSmith.registerObserver(mentor1);

        //When
        johnNowak.addTask("Task 1");
        jamesKowalski.addTask("Task 2");
        lindaSmith.addTask("Task 3");
        jamesKowalski.addTask("Task 4");
        johnNowak.addTask("Task 5");

        //Than
        assertEquals(2, jamesKowalski.getTasks().size());
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}