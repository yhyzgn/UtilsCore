package com.yhy.utils.core.common;

import java.io.Closeable;
import java.io.IOException;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-05-27 16:01
 * version: 1.0.0
 * desc   : IO 工具类
 */
public class IOUtils {

    private IOUtils() {
        throw new UnsupportedOperationException("Util class can not be instantiate.");
    }

    public static void close(Closeable io) {
        if (null != io) {
            try {
                io.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
