package com.wenjutian.mvptea.ui.Users.mvp;

import com.wenjutian.mvplibrary.di.scope.ActivityScope;
import com.wenjutian.mvplibrary.mvp.BasePresenter;
import com.wenjutian.mvptea.entity.User;

import java.util.List;

import javax.inject.Inject;

import rx.functions.Action1;

/**
 * Created by V.Wenju.Tian on 2016/11/28.
 */
@ActivityScope
public class UsersPresenter extends BasePresenter<UserModel,UsersContract.View> {

   @Inject
    public UsersPresenter(UserModel model, UsersContract.View view){
       super(model,view);
   }

    public void requestUsers(boolean ispullToRefresh){

        getmModel().getUsers(1,true).subscribe(new Action1<List<User>>() {
            @Override
            public void call(List<User> users) {

            }
        });
    };

}
