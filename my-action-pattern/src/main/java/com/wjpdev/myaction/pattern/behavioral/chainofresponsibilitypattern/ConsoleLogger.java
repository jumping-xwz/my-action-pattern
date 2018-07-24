package com.wjpdev.myaction.pattern.behavioral.chainofresponsibilitypattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
