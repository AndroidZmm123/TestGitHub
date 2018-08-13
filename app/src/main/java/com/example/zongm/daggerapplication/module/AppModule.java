package com.example.zongm.daggerapplication.module;

import javax.inject.Singleton;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.zongm.daggerapplication.MyApp;

import dagger.Module;
import dagger.Provides;

/**
 * @author zongm on 2018/8/6
 */
@Module
public class AppModule {

    private MyApp mMyApp;

    public AppModule(MyApp myApp) {
        mMyApp = myApp;
    }

    @Singleton
    @Provides
    public MyApp providesApp() {
        return mMyApp;
    }


    @Singleton
    @Provides
    public SharedPreferences providesSharePreferences() {
        return mMyApp.getSharedPreferences("test", Context.MODE_PRIVATE);
    }
}
