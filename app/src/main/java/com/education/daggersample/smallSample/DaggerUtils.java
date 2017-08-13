package com.education.daggersample.smallSample;

/**
 * Created by Sara on 7/21/2017.
 */

public class DaggerUtils {

    public static MyComponent createComponent() {
        return DaggerMyComponent.builder().build();
    }
}
