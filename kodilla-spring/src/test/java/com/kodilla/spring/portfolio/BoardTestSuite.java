package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("do it");
        board.getInProgressList().tasks.add("continues");
        board.getDoneList().tasks.add("it is done");

        //Then
        Assert.assertEquals("do it",board.getToDoList().getTasks().get(0));
        Assert.assertEquals("continues",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("it is done",board.getDoneList().getTasks().get(0));

    }
}