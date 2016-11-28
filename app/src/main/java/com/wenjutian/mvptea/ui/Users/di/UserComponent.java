package com.wenjutian.mvptea.ui.Users.di;

import android.app.Activity;

import com.wenjutian.mvplibrary.di.scope.ActivityScope;
import com.wenjutian.mvptea.di.component.AppComponent;

import dagger.Component;

/**
 * Created by V.Wenju.Tian on 2016/11/28.
 */
@ActivityScope
@Component(modules = {UserModule.class},dependencies = {AppComponent.class})
public interface UserComponent {
    void inject(Activity activity);
}
