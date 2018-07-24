package com.wjpdev.myaction.pattern.creational.singletonpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4(){}
    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}