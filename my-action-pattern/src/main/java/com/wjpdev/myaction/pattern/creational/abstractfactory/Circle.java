package com.wjpdev.myaction.pattern.creational.abstractfactory;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

