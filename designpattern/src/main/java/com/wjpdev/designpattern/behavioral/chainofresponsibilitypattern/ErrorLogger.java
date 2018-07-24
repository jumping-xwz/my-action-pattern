package com.wjpdev.designpattern.behavioral.chainofresponsibilitypattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}