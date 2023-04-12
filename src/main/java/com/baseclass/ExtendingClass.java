package com.baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ExtendingClass {
    @Before
    public void before(){
        baseuse.initmethod();
    }
    @After
    public void after(){
        baseuse.finalmethod();
    }

}
