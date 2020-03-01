package com.kodilla.testing.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import com.kodilla.patterns.singleton.SettingsFileEngine;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void openSettingsFile() {
        logger = Logger.getInstance();
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        logger.log("111");
        //Then
        assertEquals("111", logger.getLastLog());
    }
}
