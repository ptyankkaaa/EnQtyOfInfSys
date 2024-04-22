package com.example;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestCalculator {
    // @Test(groups = {"fast"})
    @Test
    public void testSum() {
        //arrange объявление необходимых объектов
        final double NUMBER1 = 2;
        final double NUMBER2 = 3;
        final double DELTA = 1e-4;
        double expectedResult = 5;
        double actualResult;

        //act де-е вызов тестируемого метода 
        actualResult = Calculator.sum(NUMBER1, NUMBER2);

        //assert сравнение ожидаемого и фактического
        Assert.assertEquals(actualResult, expectedResult, DELTA);
    }
}
