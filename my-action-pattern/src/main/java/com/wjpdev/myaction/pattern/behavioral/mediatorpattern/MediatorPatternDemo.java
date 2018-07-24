package com.wjpdev.myaction.pattern.behavioral.mediatorpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
