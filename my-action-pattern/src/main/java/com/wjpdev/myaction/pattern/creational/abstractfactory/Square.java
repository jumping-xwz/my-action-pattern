package com.wjpdev.myaction.pattern.creational.abstractfactory;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
