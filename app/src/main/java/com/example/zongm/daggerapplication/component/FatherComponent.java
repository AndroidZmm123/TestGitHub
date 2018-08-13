package com.example.zongm.daggerapplication.component;

import com.example.zongm.daggerapplication.Father;
import com.example.zongm.daggerapplication.module.FatherModule;

import dagger.Component;

/**
 * @author zongm on 2018/8/7
 */
@Component(modules = FatherModule.class)
public interface FatherComponent {
    Father provideFather();
}
