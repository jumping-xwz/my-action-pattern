package com.wjpdev.designpattern.structure.adapterpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
