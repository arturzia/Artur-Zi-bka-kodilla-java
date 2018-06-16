package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLogger() {
        //Given
        Logger logger = Logger.getInstance();

        //When
       logger.log("firstLog");
       logger.log("secondLog");
       logger.log("AAAA");
       logger.log("BBBBB");
        //Then
        Assert.assertEquals(5, logger.getLastLog().length());
        Assert.assertEquals("BBBBB", logger.getLastLog());

    }


}
