package com.wjpdev.myaction.pattern.creational.builderpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
