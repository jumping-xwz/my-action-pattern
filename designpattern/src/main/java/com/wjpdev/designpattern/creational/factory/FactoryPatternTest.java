package com.wjpdev.designpattern.creational.factory;

/**
 * Created by wjpdeveloper on 2017/7/6.
 */
public class FactoryPatternTest {
    public static void main(String[] args){
        PersonFactory factory = new PersonFactory();
        Person people1 = factory.showPeople("men");
        people1.say();

        Person people2 = factory.showPeople("woman");
        people2.say();
    }
}
