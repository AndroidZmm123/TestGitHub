package com.example.zongm.daggerapplication.component;

import com.example.zongm.daggerapplication.Main2Activity;
import com.example.zongm.daggerapplication.module.AppModule;
import com.example.zongm.daggerapplication.module.MainModule;

import dagger.Component;

/**
 * @author zongm on 2018/8/7
 *
 * 1，父Component中要显式的写出需要暴露可提供给子Component的依赖；
 * 2，子Component在注解中使用dependencies=来连接父Component；
 * 3，子Component实例化方式。需要子Component在builder()后面把父Component设置进去
 * DaggerFamilyComponent.builder()
 * .fatherComponent(fatherComponent)
 * .build()
 *
 */
@Component(dependencies = FatherComponent.class)
public interface FamilyComponent {
    void inject(Main2Activity main2Activity);
}
