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
    private WeakReference<ThreadLocal<T>> ref;

    /**
     * 无参数构造方法
     */
    public ThreadWire() {
        ref = new WeakReference<>(new ThreadLocal<>());
    }

    /**
     * 带初始值的构造方法
     *
     * @param t 初始值
     */
    public ThreadWire(T t) {
        ref = new WeakReference<>(ThreadLocal.withInitial(() -> t));
    }

    /**
     * 设置值
     *
     * @param t 当前线程下的值
     */
    public void set(T t) {
        ThreadLocal<T> local = ref.get();
        if (null == local) {
            local = new ThreadLocal<>();
        }
        local.set(t);
        ref = new WeakReference<>(local);
    }

    /**
     * 获取值
     *
     * @return 当前线程下的值
     */
    public T get() {
        ThreadLocal<T> local = ref.get();
        return null != local ? local.get() : null;
    }

    /**
     * 移除资源
     */
    public void remove() {
        ThreadLocal<T> local = ref.get();
        if (null != local) {
            local.remove();
        }
    }
}
