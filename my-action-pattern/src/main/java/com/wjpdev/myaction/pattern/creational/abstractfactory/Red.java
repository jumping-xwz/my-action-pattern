package com.wjpdev.myaction.pattern.creational.abstractfactory;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
