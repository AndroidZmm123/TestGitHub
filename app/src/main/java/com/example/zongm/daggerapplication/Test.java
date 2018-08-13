package com.example.zongm.daggerapplication;

/**
 * @author zongm on 2018/8/7
 */
public class Test {

    private String name = "默认的测试";

    public Test() {
    }
    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
