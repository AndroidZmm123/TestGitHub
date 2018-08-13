package com.example.zongm.daggerapplication.component;

import com.example.zongm.daggerapplication.Children;
import com.example.zongm.daggerapplication.module.ChildrenModule;

import dagger.Component;

/**
 * @author zongm on 2018/8/7
 */
@Component(modules = ChildrenModule.class)
public interface ChildrenComponent {

    Children providerChildren();
}
