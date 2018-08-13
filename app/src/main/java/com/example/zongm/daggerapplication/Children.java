package com.example.zongm.daggerapplication;

/**
 * @author zongm on 2018/8/7
 */
public class Children {

    private String name;

    public Children() {
        this("孩子的默认的名字");
    }

    public Children(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
