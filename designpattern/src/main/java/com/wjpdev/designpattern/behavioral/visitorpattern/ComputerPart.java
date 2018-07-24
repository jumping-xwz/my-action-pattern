package com.wjpdev.designpattern.behavioral.visitorpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}