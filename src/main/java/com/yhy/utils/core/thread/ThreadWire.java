package com.yhy.utils.core.thread;

import java.lang.ref.WeakReference;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2019-08-30 9:51
 * version: 1.0.0
 * desc   : ThreadLocal工具
 */
public class ThreadWire<T> {
    // 弱引用的ThreadLocal
    private final ThreadLocal<WeakReference<T>> local;

    /**
     * 无参数构造方法
     */
    public ThreadWire() {
        local = new ThreadLocal<>();
    }

    /**
     * 带初始值的构造方法
     *
     * @param t 初始值
     */
    public ThreadWire(T t) {
        local = ThreadLocal.withInitial(() -> new WeakReference<T>(t));
    }

    /**
     * 设置值
     *
     * @param t 当前线程下的值
     */
    public void set(T t) {
        WeakReference<T> reference = local.get();
        if (null == reference) {
            reference = new WeakReference<>(t);
        }
        local.set(reference);
    }

    /**
     * 获取值
     *
     * @return 当前线程下的值
     */
    public T get() {
        WeakReference<T> reference = local.get();
        return null != reference ? reference.get() : null;
    }

    /**
     * 移除资源
     */
    public void remove() {
        local.remove();
    }
}
