package com.wjpdev.myaction.pattern.behavioral.commandpattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] sold");
    }
}
