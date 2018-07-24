package com.wjpdev.myaction.pattern.creational.prototypepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
