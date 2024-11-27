package com.kamal.controller;

import org.junit.Assert;
import org.junit.Test;

public class BasicMathCheckTest {

    @Test
    public void Addition() {
        BasicMathCheck test = new BasicMathCheck();
        Assert.assertEquals("expected value: 7", 7, test.addition(5,2));
    }

    @Test
    public void Subtraction() {
        BasicMathCheck test = new BasicMathCheck();
        Assert.assertEquals("expected value: 3", 3, test.subtraction(5,2));
    }

    @Test
    public void Multiplication() {
        BasicMathCheck test = new BasicMathCheck();
        Assert.assertEquals("expected value: 6", 6, test.multiplication(2,3));
    }

    @Test
    public void Division() {
        BasicMathCheck test = new BasicMathCheck();
        Assert.assertEquals("expected value: 2", 2, test.division(8,4));
    }
}