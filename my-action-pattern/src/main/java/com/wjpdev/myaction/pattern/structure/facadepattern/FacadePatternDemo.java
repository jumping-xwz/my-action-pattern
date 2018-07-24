package com.wjpdev.myaction.pattern.structure.facadepattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}