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
   public void testCalculationsAdd(){

           //Given
           ApplicationContext context =
                   new AnnotationConfigApplicationContext("com.kodilla.spring");
           Calculator calculator = context.getBean(Calculator.class);
           //When
           double add = calculator.add(2,3);
           //Then
        Assert.assertEquals(5, add, 0.001);
   }

    @Test
    public void testCalculationsSub(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sub = calculator.sub(6, 4);
        //Then
        Assert.assertEquals(2, sub, 0.001);
    }

    @Test
    public void testCalculationsMul(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mul = calculator.mul(3, 3);
        //Then
        Assert.assertEquals(9, mul, 0.001);
    }

    @Test
    public void testCalculationsDiv(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double div = calculator.div(6, 2);
        //Then
        Assert.assertEquals(3, div, 0.001);
    }
}
