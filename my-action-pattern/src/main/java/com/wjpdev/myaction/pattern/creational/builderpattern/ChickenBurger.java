package com.wjpdev.myaction.pattern.creational.builderpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
