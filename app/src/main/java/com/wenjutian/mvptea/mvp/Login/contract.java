package com.wenjutian.mvptea.mvp.Login;

import com.wenjutian.mvplibrary.mvp.IView;

/**
 * Created by V.Wenju.Tian on 2016/11/22.
 */

public interface contract {

    interface View extends IView {
        void setAdapter();

        void startLoadMore();

        void endLoadMore();
    }

    interface Model {
    }


}
