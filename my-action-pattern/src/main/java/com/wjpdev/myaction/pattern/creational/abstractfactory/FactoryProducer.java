package com.wjpdev.myaction.pattern.creational.abstractfactory;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}