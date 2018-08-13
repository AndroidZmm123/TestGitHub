package com.example.zongm.daggerapplication.module;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import android.util.Log;

import com.example.zongm.daggerapplication.MyApp;
import com.example.zongm.daggerapplication.School;
import com.example.zongm.daggerapplication.Student;
import com.example.zongm.daggerapplication.Teacher;
import com.example.zongm.daggerapplication.Test;

import dagger.Module;
import dagger.Provides;

/**
 * @author zongm on 2018/7/30
 */
@Module
public class MainModule {

    Test test;

    public MainModule() {
    }

    public MainModule(Test test) {
        test.setName("zmm--->MainModule");
        this.test = test;
    }

    @Provides
    Test provideTest() {
        return test;
    }

    @Provides
    School provideSchool(Teacher teacher) {
        return new School(teacher);
    }


    @Provides
    Teacher provideTeacher(@Student.SelfType(2) Student student) {

        Teacher teacher = new Teacher(student);
        teacher.setName("provideTeacher");
        return teacher;
    }

    @Provides
    Student provideStudent() {
        //Log.e("zmm", "provideStudent------》" + student.getName());
        Student student = new Student();
        student.setName("provideStudent-->Student");
        return student;
    }

    @MyApp.ActivityScope
    @Student.SelfType(2)
    @Provides
    Student provideStudentB() {
        //Log.e("zmm", "provideStudent------》" + student.getName());
        Student student = new Student();
        student.setName("provideStudent-->Student--->NameB");
        return student;
    }
}
