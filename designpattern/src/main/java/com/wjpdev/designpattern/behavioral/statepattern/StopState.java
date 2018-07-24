package com.wjpdev.designpattern.behavioral.statepattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
