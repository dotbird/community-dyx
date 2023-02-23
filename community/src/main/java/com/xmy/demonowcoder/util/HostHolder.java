package com.xmy.demonowcoder.util;

import com.xmy.demonowcoder.entities.User;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息，用于代替Session对象
 * 获取凭证ticket多线程工具类
 * 作用：获取当前用户
 *
 * @author xumingyu的
 * @date 2022/4/27
 **/
@Component
public class HostHolder {

    // 使用ThreadLocal类来解决单例bean线程不安全问题
    private ThreadLocal<User> users = new ThreadLocal<>();

    /**
     * 从ThreadLocal线程中取出User
     **/
    public User getUser() {
        return users.get();
    }

    /**
     * 以线程为key存入User
     **/
    public void setUser(User user) {
        users.set(user);
    }

    /**
     * 释放线程
     **/
    public void clear() {
        users.remove();
    }
}
