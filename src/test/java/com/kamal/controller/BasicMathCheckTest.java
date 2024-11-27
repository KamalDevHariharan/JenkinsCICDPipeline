package com.kamal.controller;

import static org.junit.Assert.*;
import org.junit.Test;

public class BasicMathCheckTest {

    @Test
    public void Addition() {
        MyCalculator test = new MyCalculator();
        assertEquals("The output should be 7", 7, test.addition(5,2));
    }

    @Test
    public void Subtraction() {
        MyCalculator test = new MyCalculator();
        assertEquals("The output should be 3", 3, test.subtraction(5,2));
    }

    @Test
    public void Multiplication() {
        MyCalculator test = new MyCalculator();
        assertEquals("The output should be 6", 6, test.multiplication(2,3));
    }

    @Test
    public void Division() {
        MyCalculator test = new MyCalculator();
        assertEquals("The output should be 2", 2, test.division(8,4));
    }
}