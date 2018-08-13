package com.example.zongm.daggerapplication;

import javax.inject.Inject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.zongm.daggerapplication.module.BuilderModule;

public class Main3Activity extends AppCompatActivity {

    @Inject
    Student student;

    @Inject
    Teacher teacher;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    SharedPreferences sharedPreferences1;

    //@Inject
    //Test test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MyApp.get(this)
            .getAppComponent()
            .buiderBuilder()
            .builderModule(new BuilderModule(new Student("zmm")))
            //.test("外部传参的名字")
            .build()
            .inject(this);

        Log.e("zmm", "builder----------》" + teacher.getName() + "-------->" +
            teacher.getStudent().getName() + "------------->" + sharedPreferences + "--------->" + sharedPreferences1
            + "--->" + student.getName() );

    }
}
