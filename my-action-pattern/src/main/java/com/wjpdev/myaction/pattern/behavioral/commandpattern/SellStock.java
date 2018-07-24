package com.wjpdev.myaction.pattern.behavioral.commandpattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
