package com.example.zongm.daggerapplication.component;

import javax.inject.Singleton;

import com.example.zongm.daggerapplication.module.AppModule;
import com.example.zongm.daggerapplication.module.MainModule;

import dagger.Component;

/**
 * @author zongm on 2018/8/6
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    MainComponent addSub(MainModule mainModule);

    BuilderComponent.BuilderBuilder buiderBuilder();
}
