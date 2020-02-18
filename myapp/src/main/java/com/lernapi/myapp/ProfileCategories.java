package com.lernapi.myapp;

import javax.validation.constraints.NotNull;

public class ProfileCategories {
    @NotNull
    private String name;

    public String getName(){
        return name;
    }
}
