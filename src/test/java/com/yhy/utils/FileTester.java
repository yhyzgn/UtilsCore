package com.yhy.utils;

import com.yhy.utils.core.common.FileUtils;
import com.yhy.utils.core.id.IdWorker;

import java.io.File;
import java.io.IOException;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-05-28 15:37
 * version: 1.0.0
 * desc   :
 */
public class FileTester {

    public static void main(String[] args) throws Exception {
        String filename = "/Users/yhyzgn/Downloads/越狱特别篇：最后一越.Prison.Break.The.Final.Break.2009.Chi_Eng.BDrip.720X396.YYeTs人人影视.rmvb";
        boolean exists = FileUtils.exists(filename);
        System.out.println(exists);
        System.out.println(FileUtils.sizeFormatted(filename));
        System.out.println(FileUtils.md5(new File(filename)));
    }
}
