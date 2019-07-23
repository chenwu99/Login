package com.example.myapplication.utils;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MyToast {

    MyToast(AppCompatActivity activity, String s){
        Toast.makeText(activity, s, Toast.LENGTH_SHORT).show();
    }

}
