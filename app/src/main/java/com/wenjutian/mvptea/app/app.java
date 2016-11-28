package com.wenjutian.mvptea.app;

import com.antfortune.freeline.FreelineCore;
import com.wenjutian.mvplibrary.base.BaseApplication;
import com.wenjutian.mvptea.api.Api;
import com.wenjutian.mvptea.di.component.AppComponent;
import com.wenjutian.mvptea.di.component.DaggerAppComponent;

/**
 * Created by V.Wenju.Tian on 2016/11/22.
 */

public class App extends BaseApplication {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        FreelineCore.init(this);
        appComponent = DaggerAppComponent.builder().clientModule(getClientModule()).appModule(getAppModule()).build();
    }

    @Override
    protected String getBaseUrl() {
        return Api.APP_DOMAIN;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
