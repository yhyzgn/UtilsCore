package com.yhy.utils;

import com.yhy.utils.core.thread.ThreadWire;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-08-31 2:41 下午
 * version: 1.0.0
 * desc   :
 */
public class ThreadTester {

    public static void main(String[] args) {
        ThreadWire<String> wire = new ThreadWire<>("aa");
        wire.set("main");
        new Thread(() -> {
            wire.set("sub");
            System.out.println("==" + wire.get());
            wire.remove();
        }).start();
        System.out.println("**" + wire.get());
        wire.remove();
    }
}
