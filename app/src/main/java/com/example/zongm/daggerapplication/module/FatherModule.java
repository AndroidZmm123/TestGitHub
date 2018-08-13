package com.example.zongm.daggerapplication.module;

import com.example.zongm.daggerapplication.Father;

import dagger.Module;
import dagger.Provides;

/**
 * @author zongm on 2018/8/7
 */
@Module
public class FatherModule {
    @Provides
    public Father providerFather() {
        return new Father("父亲的名字");
    }
}
