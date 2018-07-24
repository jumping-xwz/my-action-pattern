package com.wjpdev.designpattern.behavioral.mementopattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
