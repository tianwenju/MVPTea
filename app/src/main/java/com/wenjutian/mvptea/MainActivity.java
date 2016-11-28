package com.wenjutian.mvptea;

import android.view.LayoutInflater;
import android.view.View;

import com.wenjutian.mvptea.di.component.AppComponent;
import com.wenjutian.mvptea.ui.Users.di.DaggerUserComponent;
import com.wenjutian.mvptea.ui.Users.mvp.UsersPresenter;

public class MainActivity extends WEActivity<UsersPresenter> {


    @Override
    protected View initView() {
        return LayoutInflater.from(this).inflate(R.layout.activity_main,null);
    }

    @Override
    protected void initData() {

        getmPresenter().requestUsers(true);
    }


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

        DaggerUserComponent.builder().appComponent(appComponent).build().inject(this);
    }
}
