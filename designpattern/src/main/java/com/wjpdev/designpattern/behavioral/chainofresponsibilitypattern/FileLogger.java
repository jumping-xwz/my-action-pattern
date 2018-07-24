package com.wjpdev.designpattern.behavioral.chainofresponsibilitypattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
