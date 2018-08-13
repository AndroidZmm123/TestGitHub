package com.example.zongm.daggerapplication.component;

import javax.inject.Singleton;

import com.example.zongm.daggerapplication.Main2Activity;
import com.example.zongm.daggerapplication.MainActivity;
import com.example.zongm.daggerapplication.MyApp;
import com.example.zongm.daggerapplication.School;
import com.example.zongm.daggerapplication.module.MainModule;

import dagger.Component;
import dagger.Subcomponent;

/**
 * @author zongm on 2018/7/30
 * 联系inject和Module的桥梁，习惯称为注入器
 * subComponent实现方式总结：
 * 1、先定义子Component，使用@Subcomponent标注（不可同时再使用@Component）；
 * 2、父Component中定义获得子Component的方法；
 * 3，子Component实例化方式：先实例化父Component。然后通过父Component里面的方法获得子Component；
 *
 * MyApp.get(this)
 * .getAppComponent()
 * .addSub(new MainModule());
 */
@MyApp.ActivityScope
@Subcomponent(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);

    void inject(Main2Activity mainActivity);

    void inject(School school);

    void inject(MainActivity.InnerClass innerClass);
}
