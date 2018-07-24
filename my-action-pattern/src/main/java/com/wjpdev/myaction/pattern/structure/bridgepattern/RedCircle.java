package com.wjpdev.myaction.pattern.structure.bridgepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
