package com.wjpdev.designpattern.creational.abstractfactory;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}