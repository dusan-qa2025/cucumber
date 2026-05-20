package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

        @Test
        public void saberiTest() {
            Calculator calc = new Calculator();
            double result = calc.saberi(1, 2);
            double expected = 3;
            Assert.assertEquals(expected,result, 0);
        }
}

