package com.example.zongm.daggerapplication;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import android.app.Application;
import android.content.Context;


import com.example.zongm.daggerapplication.component.AppComponent;
import com.example.zongm.daggerapplication.component.DaggerAppComponent;
import com.example.zongm.daggerapplication.module.AppModule;

/**
 * @author zongm on 2018/8/6
 */
public class MyApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }


    public static MyApp get(Context context) {
        return (MyApp) context.getApplicationContext();
    }

    private void setupApplicationComponent() {
        //Dagger开头的注入类DaggerAppComponent
        mAppComponent = DaggerAppComponent.builder()
            //此时appModule方法是过时方法，因为我们没有使用到任何一个module中提供的对象
            .appModule(new AppModule(this))
            .build();
    }

    //获取AppComponent 以便于SubComponent继承
    public AppComponent getAppComponent() {
        if (mAppComponent == null) {
            this.setupApplicationComponent();
        }
        return mAppComponent;
    }


    @Scope
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ActivityScope {

    }
}
