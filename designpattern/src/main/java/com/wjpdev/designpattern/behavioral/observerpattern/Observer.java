package com.wjpdev.designpattern.behavioral.observerpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}