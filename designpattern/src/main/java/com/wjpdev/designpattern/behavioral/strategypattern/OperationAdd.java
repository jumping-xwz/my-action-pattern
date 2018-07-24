package com.wjpdev.designpattern.behavioral.strategypattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}