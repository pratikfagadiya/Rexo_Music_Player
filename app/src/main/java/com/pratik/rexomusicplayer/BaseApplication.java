package com.pratik.rexomusicplayer;

import android.app.Application;

import com.pratik.rexomusicplayer.utils.PrefManager;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PrefManager.init(this);
    }
}
