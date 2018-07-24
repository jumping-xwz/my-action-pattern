package com.wjpdev.myaction.pattern.creational.singletonpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
