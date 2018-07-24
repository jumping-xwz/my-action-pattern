package com.wjpdev.designpattern.structure.bridgepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}