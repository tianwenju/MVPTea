package com.wenjutian.mvptea.ui.Users.mvp;

import com.wenjutian.mvplibrary.mvp.IView;
import com.wenjutian.mvptea.entity.User;

import java.util.List;

import rx.Observable;

/**
 * Created by V.Wenju.Tian on 2016/11/22.
 */

public interface UsersContract {
    //对于经常使用的关于UI的方法可以定义到BaseView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void setAdapter();

        void startLoadMore();

        void endLoadMore();
    }

    //Model层定义接口,外部只需关心model返回的数据,无需关心内部细节,及是否使用缓存
    interface Model {
        Observable<List<User>> getUsers(int lastIdQueried, boolean update);
    }
}
