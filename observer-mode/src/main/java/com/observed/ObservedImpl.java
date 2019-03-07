package com.observed;

import com.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyk
 * @date 2019/3/7  15:43
 */
public class ObservedImpl implements Observed {

    private List<Observer> observerList = new ArrayList<Observer>();
    private String message ;

    public void addObserver(Observer observer) {
        System.out.println("添加观察者"+observer.toString());
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        System.out.println("删除观察者");
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer1 : observerList) {
            observer1.update(message);
        }
    }

    public void setInfo(String message){
        this.message = message;
        System.out.println("被观察者（x服务）发送了服务消息 ： " + message);
        notifyObserver();

    }
}
