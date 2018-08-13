package com.example.zongm.daggerapplication;

import javax.inject.Inject;

/**
 * @author zongm on 2018/7/30
 */
public class Teacher {
    private String name;
    private int id;
    private Student student;

    @Inject
    public Teacher() {
    }

    public Teacher(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", student=" + student +
            '}';
    }
}
