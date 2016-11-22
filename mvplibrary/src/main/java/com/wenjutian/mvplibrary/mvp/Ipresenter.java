package com.wenjutian.mvplibrary.mvp;

import rx.Subscription;

/**
 * Created by jess on 16/4/28.
 */
public interface Ipresenter {
    void onStart();
    void onDestroy();
    void unSubscribe(Subscription subscription);
}
