package com.wjpdev.designpattern.creational.factory;

/**
 * Created by wjpdeveloper on 2017/7/6.
 */
public class PersonFactory{

    public Person showPeople(String type){
        if(type == null){
            return null;
        }

        if(type.equals("men")){
            return new Men();
        } else if(type.equals("woman")){
            return new Woman();
        }

        return null;
    }
}