package com.yhy.utils;

import com.yhy.utils.core.gen.IdWorker;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-08-30 9:36
 * version: 1.0.0
 * desc   :
 */
public class IDTester {

    public static void main(String[] args) {
        final IdWorker worker = IdWorker.create(12, 12);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(worker.next())).start();
        }
    }
}
