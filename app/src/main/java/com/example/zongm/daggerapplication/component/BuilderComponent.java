package com.example.zongm.daggerapplication.component;

import com.example.zongm.daggerapplication.Main2Activity;
import com.example.zongm.daggerapplication.Main3Activity;
import com.example.zongm.daggerapplication.module.BuilderModule;

import dagger.Component;
import dagger.Subcomponent;

/**
 * @author zongm on 2018/8/7
 * <p>
 * 1、在子Component，定义一个接口或抽象类（通常定义为xxBuilder），使用@Subcomponent.Builder标注：
 * (一)、编写返回值为xxBuilder，方法的参数为需要传入参数的Module，(二)、编写返回值为当前子Component的无参方法；
 * 2、父Component中定义获得子Component.Builder的方法；
 */
@Subcomponent(modules = BuilderModule.class)
public interface BuilderComponent {

    void inject(Main3Activity main3Activity);

    @Subcomponent.Builder
    interface BuilderBuilder {

        BuilderBuilder builderModule(BuilderModule builderModule);

        BuilderComponent build();

        //BuilderBuilder test(String name);
    }
}
