package com.example.zongm.daggerapplication;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author zongm on 2018/7/30
 */
public class Student {
    private int id;
    private String name;

    @Inject
    public Student() {
        name = "zmmStudent";
        id = 1;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Qualifier
    @Documented
    @Retention(RUNTIME)
    public @interface SelfType {
        int value() default 1;
    }

}
