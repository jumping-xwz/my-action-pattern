package com.wjpdev.designpattern.structure.proxypattern;

/**
 * Created by wjpdeveloper on 2017/7/8.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
