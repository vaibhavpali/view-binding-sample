package com.vaibhav.android.viewbinding;

interface MainActivityContract {
    interface Presenter {
        void onShowData(TemperatureData data);
        void showList();
    }

    interface View {
        void showData(TemperatureData data);
        void startSecondActivity();
    }
}
