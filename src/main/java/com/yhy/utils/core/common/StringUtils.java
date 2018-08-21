package com.yhy.utils.core.common;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2018-08-21 9:06
 * version: 1.0.0
 * desc   :
 */
public class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException("Can not instantiate utils class");
    }

    public static boolean isEmpty(Object object) {
        return null == object || "".equals(object.toString());
    }

    public static boolean isNotEmpty(Object object) {
        return !isEmpty(object);
    }
}
