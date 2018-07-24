package com.wjpdev.designpattern.structure.bridgepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}