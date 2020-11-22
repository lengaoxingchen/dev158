package com.example.servlet;


import org.testng.Assert;
import org.testng.annotations.Test;


public class StringCompareTest {

    String str1 = "Hello";
    String str2 = "World";

    @Test
    public void testCase1() {
        Assert.assertEquals(str1, str2, "两个字符串不相等！");
    }

    @Test
    public void testCase2() {
        Assert.assertNotEquals(str1, str2, "两个字符串相等！");
    }
}
