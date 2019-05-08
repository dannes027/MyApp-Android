package com.example.area_prueba.volley;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.area_prueba.MyAreaApplication;

public class VolleySingleton {
    private static VolleySingleton sInstance = null;
    private RequestQueue mRequestQueue;

    private VolleySingleton(){
        mRequestQueue = getRequestQueue();
    }

    public static VolleySingleton getInstance(){
        if (sInstance == null){
            sInstance = new VolleySingleton();
        }
        return sInstance;
    }
    private RequestQueue getRequestQueue(){
        if (mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(MyAreaApplication.getAppContext());
        }
        return mRequestQueue;
    }

    public void  addRequestQueue(Request request){
        mRequestQueue.add(request);
    }
}
