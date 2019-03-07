package com.observer;

/**
 * 抽象出观察者接口(观察者相当于用户)
 * @author liyk
 * @date 2019/3/7  11:08
 */
public interface Observer {

    /**
     * 当被观察者执行时，会执行该修改操作
     * @param message
     */
    void update(String message);


}
