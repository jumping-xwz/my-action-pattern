package com.wjpdev.myaction.pattern.behavioral.visitorpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
