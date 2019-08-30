package com.yhy.utils.core.common;

import java.security.SecureRandom;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-08-30 10:16
 * version: 1.0.0
 * desc   : 随机数工具类
 */
public class RandUtils {

    private static final SecureRandom RANDOM = new SecureRandom();

    private RandUtils() {
        throw new UnsupportedOperationException("Util class can not be instantiate.");
    }

    /**
     * 获取4位数字验证码
     *
     * @return 4位数字验证码
     */
    public static int captcha() {
        return captcha(4);
    }

    /**
     * 获取数字验证码
     *
     * @param length 长度 4 | 5 | 6
     * @return 数字验证码
     */
    public static int captcha(int length) {
        switch (length) {
            case 6:
                return Math.abs(RANDOM.nextInt(899999)) + 100000;
            case 5:
                return Math.abs(RANDOM.nextInt(89999)) + 10000;
            default:
                return Math.abs(RANDOM.nextInt(8999)) + 1000;
        }
    }

    /**
     * 获取4位数字验证码
     *
     * @return 4位数字验证码
     */
    public static String captchaString() {
        return captchaString(4);
    }

    /**
     * 获取数字验证码
     *
     * @param length 长度 4 | 5 | 6
     * @return 数字验证码
     */
    public static String captchaString(int length) {
        return captcha(length) + "";
    }
}
