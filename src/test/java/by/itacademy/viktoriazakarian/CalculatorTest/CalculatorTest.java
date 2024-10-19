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
        Assertions.assertEquals(3.6, new Calculator().sum(1.3, 2.3), 0.001);
    }

    @Test
    public void testSum5() {
        Assertions.assertEquals(0.0, new Calculator().sum(0.0, 0.0), 0.001);
    }

    @Test
    public void testSum6() {
        Assertions.assertEquals(-7.5, new Calculator().sum(-8.4, 0.9), 0.001);
    }

    @Test
    public void testSub1() {
        Assertions.assertEquals(4, new Calculator().subtract(5, 1));
    }

    @Test
    public void testSub2() {
        Assertions.assertEquals(-8, new Calculator().subtract(-2, 6));
    }

    @Test
    public void testSub3() {
        Assertions.assertEquals(0, new Calculator().subtract(0, 0));
    }

    @Test
    public void testSub4() {
        Assertions.assertEquals(10.3, new Calculator().subtract(10.6, 0.3), 0.001);
    }

    @Test
    public void testSub5() {
        Assertions.assertEquals(-3.0, new Calculator().subtract(5.1, 8.1), 0.001);
    }

    @Test
    public void testSub6() {
        Assertions.assertEquals(0.0, new Calculator().subtract(0.0, 0.0), 0.001);
    }

    @Test
    public void testMult1() {
        Assertions.assertEquals(10, new Calculator().multiply(2,5));
    }

    @Test
    public void testMult2() {
        Assertions.assertEquals(0, new Calculator().multiply(0,15));
    }

    @Test
    public void testMult3() {
        Assertions.assertEquals(-3, new Calculator().multiply(-1,3));
    }

    @Test
    public void testMult4() {
        Assertions.assertEquals(6.9, new Calculator().multiply(2.3,3.0), 0.001);
    }

    @Test
    public void testMult5() {
        Assertions.assertEquals(9.3, new Calculator().multiply(-3.1,-3.0), 0.001);
    }

    @Test
    public void testMult6() {
        Assertions.assertEquals(0.0, new Calculator().multiply(0.0,5.8), 0.001);
    }

    @Test
    public void testDiv1() {
        Assertions.assertEquals(2, new Calculator().divide(10,5));
    }

    @Test
    public void testDiv2() {
        Assertions.assertEquals(-1, new Calculator().divide(-10,10));
    }

    @Test
    public void testDiv3() {
        Assertions.assertEquals(0, new Calculator().divide(0,3));
    }

    @Test
    public void testDiv4() {
        Assertions.assertEquals(3.3, new Calculator().divide(9.9,3.0), 0.001);
    }

    @Test
    public void testDiv5() {
        Assertions.assertEquals(-7.0, new Calculator().divide(7.0,-1.0), 0.001);
    }

    @Test
    public void testDiv6() {
        Assertions.assertEquals(0.0, new Calculator().divide(0.0,8.0), 0.001);
    }
}
