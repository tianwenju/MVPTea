package com.wenjutian.mvptea;

import com.wenjutian.mvplibrary.base.BaseActivity;
import com.wenjutian.mvplibrary.mvp.BasePresenter;
import com.wenjutian.mvptea.app.App;
import com.wenjutian.mvptea.di.component.AppComponent;

/**
 * Created by V.Wenju.Tian on 2016/11/28.
 */

public abstract class WEActivity<P extends BasePresenter> extends BaseActivity<P> {
    protected App mWeApplication;
    @Override
    protected void ComponentInject() {
        mWeApplication = (App) getApplication();
        setupActivityComponent(mWeApplication.getAppComponent());
    }

    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupActivityComponent(AppComponent appComponent);
}
