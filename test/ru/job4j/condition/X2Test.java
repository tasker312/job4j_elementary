package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = X2.calc(a, b, c, x);
        int exp = 3;
        assertEquals(exp, result);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = X2.calc(a, b, c, x);
        int exp = 2;
        assertEquals(exp, result);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int result = X2.calc(a, b, c, x);
        int exp = 2;
        assertEquals(exp, result);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int result = X2.calc(a, b, c, x);
        int exp = 1;
        assertEquals(exp, result);
    }
}