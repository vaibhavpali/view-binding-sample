package com.vaibhav.android.viewbinding;

import android.content.Context;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private final MainActivity mView;
    private final Context mAppContext;

    public MainActivityPresenter(MainActivity view, Context ctx) {
        mView = view;
        mAppContext = ctx;
    }

    @Override
    public void onShowData(TemperatureData data) {
        mView.showData(data);
    }

    @Override
    public void showList() {
        mView.startSecondActivity();
    }
}
