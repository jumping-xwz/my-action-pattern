package com.wjpdev.designpattern.behavioral.nullobjectpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}