package com.wjpdev.myaction.pattern.creational.builderpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
