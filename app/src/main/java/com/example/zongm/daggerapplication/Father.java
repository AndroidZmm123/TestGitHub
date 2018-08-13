package com.example.zongm.daggerapplication;

import javax.inject.Inject;

/**
 * @author zongm on 2018/8/7
 */
public class Father {
    private String name;

    @Inject
    public Father() {
        name = "默认的父亲名字";
    }

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
