package com.wenjutian.mvptea.ui.Users.mvp;

import com.wenjutian.mvptea.entity.User;

import java.util.List;

import rx.Observable;

/**
 * Created by V.Wenju.Tian on 2016/11/23.
 */


public class UserModel implements UsersContract.Model {


    @Override
    public Observable<List<User>> getUsers(int lastIdQueried, boolean update) {
        return null;
    }


}
