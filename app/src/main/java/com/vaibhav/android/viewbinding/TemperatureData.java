package com.vaibhav.android.viewbinding;

import androidx.databinding.BaseObservable;

public class TemperatureData extends BaseObservable {
    private String mLocation;
    private String mCelsius;
    public String url = "http://lorempixel.com/400/200/";

    public TemperatureData(String location, String celsius) {
        this.mLocation = location;
        this.mCelsius = celsius;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getCelsius() {
        return mCelsius;
    }

    public void setLocation(String location) {
        this.mLocation = location;
        notifyPropertyChanged(BR.temperature);
    }

    public void setCelsius(String celsius) {
        this.mCelsius = celsius;
        notifyPropertyChanged(BR.temperature);
    }
}
