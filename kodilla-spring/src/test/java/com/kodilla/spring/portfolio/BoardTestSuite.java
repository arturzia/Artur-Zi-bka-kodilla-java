package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);


        //When
        board.getToDoList().getTasks().add("task1");
        board.getToDoList().getTasks().add("task2");

        board.getDoneList().getTasks().add("task3");
        board.getDoneList().getTasks().add("task4");

        board.getInProgressList().getTasks().add("task5");
        board.getInProgressList().getTasks().add("task6");


        //Then
        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(1));
        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(1));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(1));

        Assert.assertEquals(2, board.getToDoList().getTasks().size());
        Assert.assertEquals(2, board.getDoneList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
    }
}

