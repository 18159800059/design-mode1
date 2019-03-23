package com;


/**
 * @author ：lyk
 * @date ：Created in 2019/3/23 13:49
 */
public class Main {

    public static void main(String[] args) {

        Logintor logintor = new Logintor("张珊","123456789");
        LoginStrategy loginStrategy = new LoginStrategyImpl();
        //如果下次有其他的登陆策略，可以直接实现LoginStrategy接口，重写方法。无需修改原本的代码、
        logintor.setLoginStrategy(loginStrategy);
        logintor.execute();

    }
}
