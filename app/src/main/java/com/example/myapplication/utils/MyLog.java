package com.example.myapplication.utils;

import android.util.Log;

public class MyLog {
    MyLog(Object object){
        Log.d("123123",object + "");
    }

    public MyLog(String s){
        Log.d("123123",s);
    }
}
