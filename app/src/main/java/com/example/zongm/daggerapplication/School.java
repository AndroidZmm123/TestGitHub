package com.example.zongm.daggerapplication;

import javax.inject.Inject;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.example.zongm.daggerapplication.module.MainModule;

/**
 * @author zongm on 2018/7/30
 */
public class School {
    private int id;
    private String name;
    private Teacher teacher;
    private String defaultname = "默认名字";
    @Inject
    Student student;


    public School(Teacher teacher) {
        this.teacher = teacher;
        //DaggerMainComponent.builder().mainModule(new MainModule()).build().inject(this);
        // MyApp.get(this)
        //    .getAppComponent()
        //    .addSub(new MainModule())
        //    .inject(this);
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDefaultname() {
        return defaultname;
    }

    public void setDefaultname(String defaultname) {
        this.defaultname = defaultname;
    }

    public boolean isEmpty(String name) {
        if (TextUtils.isEmpty(name)) {
            return true;
        }
        return false;
    }

    public void OnClick(View view) {
        Log.e("zmm", "OnClick-------------->");
    }

    public void click() {
        Log.e("zmm", "自定义点击事件-------------->");

    }

    @Override
    public String toString() {
        return "School{" +
            "teacher=" + teacher +
            '}';
    }
}
