package com.wjpdev.designpattern.behavioral.visitorpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}