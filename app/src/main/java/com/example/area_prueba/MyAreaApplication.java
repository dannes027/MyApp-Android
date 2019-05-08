package com.example.area_prueba;

import android.app.Application;
import android.content.Context;

public class MyAreaApplication extends Application {
    private static MyAreaApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static MyAreaApplication getInstance(){
        return sInstance;
    }
    public static Context getAppContext(){
        return sInstance.getApplicationContext();
    }
}
