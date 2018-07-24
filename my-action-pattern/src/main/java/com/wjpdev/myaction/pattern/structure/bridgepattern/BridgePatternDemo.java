package com.wjpdev.myaction.pattern.structure.bridgepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
