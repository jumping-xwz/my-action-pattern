package com.wjpdev.myaction.pattern.behavioral.visitorpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
