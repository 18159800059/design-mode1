package com.observed;

import com.observer.Observer;

/**
 * 抽象出被观察者接口(被观察者相当于服务)
 * @author liyk
 * @date 2019/3/7  15:33
 */
public interface Observed {

    /**
     * 添加观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者，所有观察者会收到消息通知
     */
    void notifyObserver();


}
