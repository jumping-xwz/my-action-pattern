package com.wjpdev.designpattern.behavioral.templatepattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
