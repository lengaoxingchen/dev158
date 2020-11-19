package com.example.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "data")
    public void testLogin(String username, String password, String prompted) {
        System.out.println("如果输入:" + username + "、" + password + ",提示:" + prompted);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider1() {
        return new Object[][]{
                new Object[]{
                        "空账号", "正确密码", "账号不能为空!"
                },
                new Object[]{
                        "正确账号", "空密码", "密码不能为空!"
                },
                new Object[]{
                        "正确账号", "正确密码", "登录成功!"
                }
        };
    }
}
