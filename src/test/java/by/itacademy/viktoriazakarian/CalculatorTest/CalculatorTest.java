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

    @Test
    public void testSub1() {
        Assertions.assertEquals(4, new Calculator().subtraction(5, 1));
    }

    @Test
    public void testSub2() {
        Assertions.assertEquals(-8, new Calculator().subtraction(-2, 6));
    }

    @Test
    public void testSub3() {
        Assertions.assertEquals(0, new Calculator().subtraction(0, 0));
    }

    @Test
    public void testSub4() {
        Assertions.assertEquals(9.5, new Calculator().subtraction(10.0, 0.5));
    }

    @Test
    public void testSub5() {
        Assertions.assertEquals(-3.0, new Calculator().subtraction(5.1, 8.1));
    }

    @Test
    public void testSub6() {
        Assertions.assertEquals(0.0, new Calculator().subtraction(0.0, 0.0));
    }

    @Test
    public void testMult1() {
        Assertions.assertEquals(10, new Calculator().multiplication(2,5));
    }

    @Test
    public void testMult2() {
        Assertions.assertEquals(0, new Calculator().multiplication(0,15));
    }

    @Test
    public void testMult3() {
        Assertions.assertEquals(-3, new Calculator().multiplication(-1,3));
    }

    @Test
    public void testMult4() {
        Assertions.assertEquals(10.2, new Calculator().multiplication(2.0,5.1));
    }

    @Test
    public void testMult5() {
        Assertions.assertEquals(9.3, new Calculator().multiplication(-3.1,-3.0));
    }

    @Test
    public void testMult6() {
        Assertions.assertEquals(0.0, new Calculator().multiplication(0.0,5.8));
    }
}
