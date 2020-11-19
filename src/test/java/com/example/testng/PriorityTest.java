package com.example.testng;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(description = "测试用例1")  //description代表测试用例描述,控制台打印输出该描述
    public void testCase1() {
        System.out.println("testCase1");
    }

    @Test(priority = 2)  //priority代表优先级,数字越小,优先级越高,默认值为0
    public void testCase2() {
        System.out.println("testCase2");
    }

    @Test(priority = 1)
    public void testCase3() {
        System.out.println("testCase3");
    }

    @Test
    public void testCase4() {
        System.out.println("testCase4");
        throw new RuntimeException("testCase4运行异常");
    }

    @Test(groups = {"myGroup"})
    public void testCase5() {
        System.out.println("testCase5");
        throw new RuntimeException("testCase5运行异常");
    }

    @Test(enabled = false)   //enabled的默认值为true,代表不启动.  false表示禁用,该case并不会被执行
    public void testCase6() {
        System.out.println("testCase6");
    }

    //dependsOnMethods和dependsOnGroups:依赖一个或多个方法或者组.依赖的测试用例执行失败,则跳过该测试用例.
    // 尽量不用使用此两个方法,因为违背了测试用例需要解耦的原则
    //alwaysRun的方法为true代表始终执行,所以该case没有跳过执行
    @Test(dependsOnMethods = {"testCase4"}, dependsOnGroups = {"myGroup"}, alwaysRun = true)
    public void testCase7() {
        System.out.println("testCase7");
    }
}
