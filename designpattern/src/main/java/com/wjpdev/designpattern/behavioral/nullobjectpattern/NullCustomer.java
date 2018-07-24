package com.wjpdev.designpattern.behavioral.nullobjectpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
