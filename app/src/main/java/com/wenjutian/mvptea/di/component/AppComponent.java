package com.wenjutian.mvptea.di.component;

import android.app.Application;

import com.wenjutian.mvplibrary.di.module.AppModule;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by V.Wenju.Tian on 2016/11/22.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {

    Application Application();

    OkHttpClient okhttpclient();

}
