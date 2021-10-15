package by.it.academy.java.enterprise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    /**
     * Unit test for Calculator class.
     */
    @Test
    public void sumTest() {
        //given
        int a = 5;
        int b = 12;
        int expectedSum = 17;
        //when
        int actualSum = Calculator.sum(a, b);
        //then
        assertEquals(expectedSum, actualSum);
    }
}

