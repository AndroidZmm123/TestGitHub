package com.example.zongm.daggerapplication;

import java.io.Serializable;

import javax.inject.Inject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import com.example.zongm.daggerapplication.component.MainComponent;
import com.example.zongm.daggerapplication.module.MainModule;

public class MainActivity extends AppCompatActivity {

    @Student.SelfType(2)
    @Inject
    Student student;

    @Student.SelfType(2)
    @Inject
    Student student2;

    @Inject
    Teacher teacher;

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    Test test;

    //@Inject
    //School school;


    //private ActivityMainBinding binding;
    private MainComponent build;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        build = MyApp.get(this)
            .getAppComponent()
            .addSub(new MainModule(new Test()));
        build
            .inject(this);

        //build = DaggerMainComponent.builder().mainModule(new MainModule(new Student())).build();
        //build.inject(this);
        //student.setName("zmm");
        TextView tvName = findViewById(R.id.tv_name);

        tvName.setText(student.getName());

        Log.e("zmm", "test----------->" + test.getName());
        //Log.e("zmm", "学生的名字------------>" + student.getName()
        //    + "--->" + student + sharedPreferences);
        //
        //Log.e("zmm", "学生2的名字------------>" + student2.getName() + "--->" + student2);
        //Log.e("zmm", "老师下面的学生的名字------------>" + teacher.getStudent().getName());
        //student.setName("zmm");
        //tvName.setText(student.getName());
        //teacher.setName("zmmteacher");
        //int a = 1 << 1;//2
        //int i = 1 << 2;//4
        //int j = 1 << 3;//8
        //int k = 1 << 4;//16
        //int l = 1 << 5;//32
        //int g = 1 << 6;//64
        //int h = 1 << 7;//128
        //int m = a | i | j | k | l | g | h;
        //Log.e("zmm", "---------->" + m);
        //school.setName("测试学习");
        //binding.setSchool(school);
    }

    public void start(View viiew) {
        //Intent intent = new Intent(this, Main2Activity.class);
        //intent.putExtra("name", (Serializable) build);
        //startActivity(intent);

        InnerClass innerClass = new InnerClass(build, this);

    }


    public class InnerClass {

        @Student.SelfType(2)
        @Inject
        Student student;

        @Student.SelfType(2)
        @Inject
        Student student2;

        @Inject
        SharedPreferences sharedPreferences;

        //MainComponent mBbuilder;

        //同一个Component对象内，单例是有效的
        public InnerClass(MainComponent builder, Context context) {
            //mBbuilder = builder;
            //mBbuilder.inject(this);

            MyApp.get(context)
                .getAppComponent()
                .addSub(new MainModule())
                .inject(this);
            testDagger();
        }


        private void testDagger() {
            Log.e("zmm", "InnerClass--->学生的名字------------>" + student + "--->" +
                student2 + "--->" + sharedPreferences);
        }
    }
}
