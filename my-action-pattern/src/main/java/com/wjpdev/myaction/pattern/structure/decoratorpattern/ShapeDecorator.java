package com.wjpdev.myaction.pattern.structure.decoratorpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
