package com.test;

import com.observed.Observed;
import com.observed.ObservedImpl;
import com.observer.Observer;
import com.observer.ObserverImpl;

/**
 * @author liyk
 * @date 2019/3/7  16:02
 */
public class Main {

    public static void main(String[] args) {

        //定义观察者(程序)
        Observer observer1 = new ObserverImpl("张三");
        Observer observer2 = new ObserverImpl("李四");
        Observer observer3 = new ObserverImpl("王五");

        //定义被观察者(服务)
        ObservedImpl observedImpl = new ObservedImpl();

        //添加观察者
        observedImpl.addObserver(observer1);
        observedImpl.addObserver(observer2);
        observedImpl.addObserver(observer3);

        //被观察者设置消息
        observedImpl.setInfo("java语言很不错");
        System.out.println("=====================");
        observedImpl.setInfo("php语言很不错");

    }
}
