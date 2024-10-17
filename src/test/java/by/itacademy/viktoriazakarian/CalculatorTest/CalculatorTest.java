package by.itacademy.viktoriazakarian.CalculatorTest;

import by.itacademy.viktoriazakarian.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum1() {
        Assertions.assertEquals(5, new Calculator().sum(2,3));
    }

    @Test
    public void testSum2() {
        Assertions.assertEquals(-5, new Calculator().sum(-1,-4));
    }

    @Test
    public void testSum3() {
        Assertions.assertEquals(0, new Calculator().sum(0,0));
    }

    @Test
    public void testSum4() {
        Assertions.assertEquals(7.0, new Calculator().sum(5.4, 1.6));
    }

    @Test
    public void testSum5() {
        Assertions.assertEquals(0.0, new Calculator().sum(0.0, 0.0));
    }

    @Test
    public void testSum6() {
        Assertions.assertEquals(-7.5, new Calculator().sum(-8.4, 0.9));
    }
}
