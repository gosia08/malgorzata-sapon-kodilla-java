package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;


public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.doTheTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("List", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.doTheTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting home",painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.doTheTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Library", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }
}

