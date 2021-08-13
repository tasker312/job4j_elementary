package ru.job4j.loop;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int exp = 120;
        int result = Factorial.calc(in);
        assertEquals(exp, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int exp = 1;
        int result = Factorial.calc(in);
        assertEquals(exp, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int in = 1;
        int exp = 1;
        int result = Factorial.calc(in);
        assertEquals(exp, result);
    }
}