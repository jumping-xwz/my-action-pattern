package com.wjpdev.myaction.pattern.creational.builderpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
