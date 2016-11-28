package com.wenjutian.mvptea.di.component;

import android.app.Application;

import com.wenjutian.mvplibrary.di.module.AppModule;
import com.wenjutian.mvplibrary.di.module.ClientModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by V.Wenju.Tian on 2016/11/22.
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class})
public interface AppComponent {

    Application Application();

    OkHttpClient okhttpclient();

}
