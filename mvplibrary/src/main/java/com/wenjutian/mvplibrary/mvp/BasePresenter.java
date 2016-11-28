package com.wenjutian.mvplibrary.mvp;

import org.simple.eventbus.EventBus;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by jess on 16/4/28.
 */
public class BasePresenter<M, V extends IView> implements Ipresenter {
    protected final String TAG = this.getClass().getSimpleName();
    protected CompositeSubscription mCompositeSubscription;

    protected M mModel;
    protected V mView;


    public BasePresenter(M model, V mView) {
        this.mModel = model;
        this.mView = mView;
        onStart();
    }

    public M getmModel() {
        return mModel;
    }

    public V getmView() {
        return mView;
    }

    public BasePresenter(V rootView) {
        this.mView = rootView;
        onStart();
    }

    public BasePresenter() {
        onStart();
    }


    @Override
    public void onStart() {
        if (useEventBus())//如果要使用eventbus请将此方法返回true
            EventBus.getDefault().register(this);//注册eventbus
    }

    @Override
    public void onDestroy() {
        if (useEventBus())//如果要使用eventbus请将此方法返回true
            EventBus.getDefault().unregister(this);//解除注册eventbus
        unSubscribe();//解除订阅
        this.mModel = null;
        this.mView = null;
    }

    protected void handleError(Throwable throwable) {

    }

    /**
     * 是否使用eventBus,默认为使用(true)，
     *
     * @return
     */
    protected boolean useEventBus() {
        return false;
    }


    protected void addSubscrebe(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);//将所有subscription放入,集中处理
    }

    protected void unSubscribe() {
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();//保证activity结束时取消所有正在执行的订阅
        }
    }

    @Override
    public void unSubscribe(Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();//保证activity结束时取消所有正在执行的订阅
        }
    }

}
