package com.education.daggersample.smallSample;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Sara on 7/21/2017.
 */

public class CustomUser {

    //@Inject
    //User user;

    @Inject
    Book book;

    public CustomUser() {
       DaggerUtils.createComponent().inject(this);
    }

    public void showUser() {
        //Log.e("firstName", user.getFirstName());
       // Log.e("lastName", user.getLastName());
        Log.e("book", book.getName());

    }
}
