package com.kodilla.patterns.factory.tasks;

import org.junit.Test;
import org.junit.Assert;


public class TaskFactoryTestSuite {

    @Test
    public void taskFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Buy dress", shopping.getTaskName());
    }

    @Test
    public void taskFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals(false, painting.isTaskExecuted());
        Assert.assertEquals("Painting house", painting.getTaskName());
    }

    @Test
    public void taskFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then

        Assert.assertEquals("Driving to", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
