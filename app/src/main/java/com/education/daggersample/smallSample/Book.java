package com.education.daggersample.smallSample;

import javax.inject.Inject;

import dagger.Module;

/**
 * Created by Sara on 7/21/2017.
 */

public class Book {

    private String name;

    @Inject
    public Book() {

        name = "sychology";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
