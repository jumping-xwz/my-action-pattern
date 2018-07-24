package com.wjpdev.designpattern.behavioral.statepattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
