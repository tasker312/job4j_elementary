package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to22thenSqrt8() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double exp = Math.sqrt(8);
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(exp, actual, 0.01);
    }

    @Test
    public void when00to34then5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double exp = 5;
        double actual = Point.distance(x1, y1, x2, y2);
        assertEquals(exp, actual, 0.01);
    }
}