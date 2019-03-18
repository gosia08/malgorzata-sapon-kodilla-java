package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculator() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(6, 10);
        double subResult = calculator.sub(4, 2);
        double mulResult = calculator.mul(2, 3);
        double divResult = calculator.div(15, 3);
        //Then
        Assert.assertEquals(addResult, 16, 0.001);
        Assert.assertEquals(subResult, 2, 0.001);
        Assert.assertEquals(mulResult, 6, 0.001);
        Assert.assertEquals(divResult, 5, 0.001);
    }
}