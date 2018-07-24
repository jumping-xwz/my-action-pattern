package com.wjpdev.myaction.pattern.behavioral.iteratorpattern;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
