package com.wjpdev.myaction.pattern.behavioral.mementopattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}