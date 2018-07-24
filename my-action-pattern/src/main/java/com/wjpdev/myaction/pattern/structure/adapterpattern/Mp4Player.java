package com.wjpdev.myaction.pattern.structure.adapterpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
