package com.observer;

/**
 * @author liyk
 * @date 2019/3/7  15:59
 */
public class ObserverImpl implements Observer {

    private String message;
    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name+"收到了推送消息: "+ message);
    }
}
