package com.example.zongm.daggerapplication.module;

import com.example.zongm.daggerapplication.Children;

import dagger.Module;
import dagger.Provides;

/**
 * @author zongm on 2018/8/7
 */
@Module
public class ChildrenModule {

    @Provides
    public Children providerChildren(String name) {
        return new Children(name);
    }
    @Provides
    public String providerChildrenName() {
        return "孩子的名字";
    }
}
