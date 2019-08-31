package com.yhy.utils;

import com.yhy.utils.core.common.RandUtils;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-08-30 10:30
 * version: 1.0.0
 * desc   :
 */
public class RandTester {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(RandUtils.captchaString(6));
        }
    }
}
