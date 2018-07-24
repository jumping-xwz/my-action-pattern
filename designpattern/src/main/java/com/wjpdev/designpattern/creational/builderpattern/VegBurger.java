package com.wjpdev.designpattern.creational.builderpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
