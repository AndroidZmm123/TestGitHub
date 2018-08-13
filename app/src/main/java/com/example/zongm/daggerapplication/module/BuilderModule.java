package com.example.zongm.daggerapplication.module;

import com.example.zongm.daggerapplication.Student;
import com.example.zongm.daggerapplication.Teacher;
import com.example.zongm.daggerapplication.Test;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

/**
 * @author zongm on 2018/8/7
 */
@Module
public class BuilderModule {

    private Student student;

    private String test;

    public BuilderModule(Student student) {
        this.student = student;
    }

    //public BuilderModule(String test) {
    //    this.test = test;
    //}

    @Provides
    public Teacher providesTeacher() {
        return new Teacher(student);
    }

    //@Provides
    //public Test providesTest() {
    //    return new Test(test);
    //}
}
