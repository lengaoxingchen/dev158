package com.example.servlet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
public class CalculatorForPpiTest {

    public static int width;
    public static int height;
    public static double size;

    @BeforeAll
    static void init() {
        width = 750;
        height = 1334;
        size = 4.7;
    }

    @Test
    public void testCase1() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(width, height, size));
    }

    @Test
    public void testCase2() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(-1, height, size));
    }

    @Test
    public void testCase3() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(0, height, size));
    }

    @Test
    public void testCase4() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(width, -1, size));
    }

    @Test
    public void testCase5() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(width, 0, size));
    }

    @Test
    public void testCase6() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(width, height, -1));
    }

    @Test
    public void testCase7() {
        Assertions.assertEquals(-1, CalculatorForPpi.calculate(width, height, 0));
    }

}