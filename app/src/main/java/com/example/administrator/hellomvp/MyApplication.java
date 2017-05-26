package com.example.administrator.hellomvp;

import android.app.Application;

import com.example.administrator.hellomvp.model.UserRepository;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/5/26.
 */

public class MyApplication extends Application {


    @Inject
    UserRepository userRepository;

    @Override
    public void onCreate() {
        super.onCreate();



    }



}
