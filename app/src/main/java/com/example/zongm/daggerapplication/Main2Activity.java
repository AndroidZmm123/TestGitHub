package com.example.zongm.daggerapplication;

import javax.inject.Inject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.zongm.daggerapplication.component.DaggerFamilyComponent;
import com.example.zongm.daggerapplication.component.DaggerFatherComponent;
import com.example.zongm.daggerapplication.component.FatherComponent;


public class Main2Activity extends AppCompatActivity {


    @Inject
    Father father;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FatherComponent fatherComponent = DaggerFatherComponent.builder()
            .build();
        DaggerFamilyComponent.builder()
            .fatherComponent(fatherComponent)
            .build()
            .inject(this);

        Log.e("zmm", "----------》" + father.getName() + "-------->" + student.getName());


    }
}
