package com.wjpdev.myaction.pattern.behavioral.mediatorpattern;

import java.util.Date;

/**
 * Created by wjpdeveloper on 2017/7/10.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
