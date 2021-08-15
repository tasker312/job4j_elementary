package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax123Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int exp = 3;
        int result = Max.max(first, second, third);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void whenMax3124Then4() {
        int first = 3;
        int second = 1;
        int third = 2;
        int fourth = 4;
        int exp = 4;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(exp, result);
    }
}