package com.wjpdev.designpattern.behavioral.commandpattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
