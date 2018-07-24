package com.wjpdev.designpattern.creational.singletonpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1 (){}
    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}