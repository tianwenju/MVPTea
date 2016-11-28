package com.wenjutian.mvptea.ui.Users.di;

import com.wenjutian.mvplibrary.di.scope.ActivityScope;
import com.wenjutian.mvptea.ui.Users.mvp.UsersContract;
import com.wenjutian.mvptea.ui.Users.mvp.UserModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by V.Wenju.Tian on 2016/11/28.
 */

@Module
public class UserModule {
    private UsersContract.View view;
    /**
     * 构建UserModule时，将view传进来，这样就可以提供一个View给Presenter
     * @param view
     */
    public UserModule(UsersContract.View view) {
        this.view = view;
    }
    @ActivityScope
    @Provides
    UsersContract.View providerView() {
        return  view;
    }
    @ActivityScope
    @Provides
    UsersContract.Model providerModel() {
        return new UserModel();
    }
}
