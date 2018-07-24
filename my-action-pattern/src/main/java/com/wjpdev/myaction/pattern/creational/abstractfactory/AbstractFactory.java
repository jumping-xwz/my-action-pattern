package com.wjpdev.myaction.pattern.creational.abstractfactory;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
