package com.education.daggersample.smallSample;

import javax.inject.Qualifier;

import dagger.Component;

/**
 * Created by Sara on 7/21/2017.
 */

@Component(modules = {MyModule.class})
public interface MyComponent {

    void inject(CustomUser user);

    void inject(Custom2 custom2);

}
