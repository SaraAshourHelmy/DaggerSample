package com.education.daggersample.smallSample;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sara on 7/21/2017.
 */

@Module
public class MyModule {


    public MyModule() {

    }

    @Provides
    public User getUser() {
        return new User("noha", "helmy");
    }
}
