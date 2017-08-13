package com.education.daggersample.smallSample;

import android.util.Log;

import java.util.concurrent.Callable;

import javax.inject.Inject;
import javax.security.auth.callback.Callback;

/**
 * Created by Sara on 7/21/2017.
 */

public class Custom2 {

 Callable<Integer> callable=new Callable<Integer>() {
     @Override
     public Integer call() throws Exception {
         return null;
     }
 };
    @Inject
    User user;

    public Custom2() {
        DaggerUtils.createComponent().inject(this);
    }

    public void getData() {
        Log.e("firstName", user.getFirstName());
        Log.e("lastName", user.getLastName());
    }

}
