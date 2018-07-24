package com.wjpdev.designpattern.creational.prototypepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
