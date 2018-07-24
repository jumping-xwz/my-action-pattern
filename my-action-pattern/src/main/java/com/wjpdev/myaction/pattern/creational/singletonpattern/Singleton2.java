package com.wjpdev.myaction.pattern.creational.singletonpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2 (){}
    public static Singleton2 getInstance() {
        return instance;
    }
}
