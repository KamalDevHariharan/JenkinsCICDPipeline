package com.kamal.controller;

import static org.junit.Assert.*;
import org.junit.Test;

public class BasicMathCheckTest {

    @Test
    public void Addition() {
        BasicMathCheckTest test = new BasicMathCheckTest();
        assertEquals("The output should be 7", 7, test.addition(5,2));
    }

    @Test
    public void Subtraction() {
        BasicMathCheckTest test = new BasicMathCheckTest();
        assertEquals("The output should be 3", 3, test.subtraction(5,2));
    }

    @Test
    public void Multiplication() {
        BasicMathCheckTest test = new BasicMathCheckTest();
        assertEquals("The output should be 6", 6, test.multiplication(2,3));
    }

    @Test
    public void Division() {
        BasicMathCheckTest test = new BasicMathCheckTest();
        assertEquals("The output should be 2", 2, test.division(8,4));
    }
}