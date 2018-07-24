package com.wjpdev.myaction.pattern.behavioral.observerpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}