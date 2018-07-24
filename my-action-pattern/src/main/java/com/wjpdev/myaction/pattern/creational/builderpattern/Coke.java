package com.wjpdev.myaction.pattern.creational.builderpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
