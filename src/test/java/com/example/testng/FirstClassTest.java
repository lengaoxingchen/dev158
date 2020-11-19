package com.example.testng;

import org.testng.annotations.*;

/**
 * 注解的运行顺序:BeforeSuite  ->  BeforeClass -> BeforeGroup -> BeforeMethod -> Test
 * -> AfterMethod -> AfterGroup -> AfterClass -> AfterSuite
 *
 * 当多个分组都设置了对应的@BeforeGroup和@AfterGroup注解时,执行顺序是
 * BeforeGroup1 -> BeforeGroup2 -> AfterGroup2 -> AfterGroup1
 *
 * @author v_lujichao
 */
public class FirstClassTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("++beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("+afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("++--beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("++--afterClass");
    }

    @BeforeGroups(groups = {"g1"})
    public void beforeGroups1() {
        System.out.println("++--++beforeGroup1");
    }

    @AfterGroups(groups = {"g1"})
    public void afterGroups1() {
        System.out.println("++--++afterGroup1");
    }

    @BeforeGroups(groups = {"g2"})
    public void beforeGroups2() {
        System.out.println("++--++beforeGroup2");
    }

    @AfterGroups(groups = {"g2"})
    public void afterGroups2() {
        System.out.println("++--++afterGroup2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("++--++--beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("++--++--afterMethod");
    }


    @Test(groups = {"g1"})
    public void testCase1() {
        System.out.println("++--++--++testCase1");
    }

    @Test(groups = {"g2"})
    public void testCase2() {
        System.out.println("++--++--++testCase2");
    }

    @Test(groups = {"g2"})
    public void testCase3() {
        System.out.println("++--++--++testCase3");
    }

    @Test(groups = {"g1", "g2"})
    public void testCase4() {
        System.out.println("++--++--++testCase4");
    }
}
