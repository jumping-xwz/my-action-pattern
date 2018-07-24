package com.wjpdev.myaction.pattern.behavioral.statepattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}