package com;

/**
 * @author ：lyk
 * @date ：Created in 2019/3/23 13:52
 */
public class Logintor {

    /**
     * 登录名
     */
    private String LoginName;

    /**
     * 登陆密码
     */
    private String LoginPassword;

    /**
     * 登陆策略
     */
    LoginStrategy loginStrategy;

    public Logintor(String loginName, String loginPassword) {
        this.LoginName = loginName;
        this.LoginPassword = loginPassword;
    }

    //专门提供给子类或者对象重写的
    protected void executeLogin(){
        loginStrategy.loginStrategy();
    }

    public void execute(){
        executeLogin();
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getLoginPassword() {
        return LoginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        LoginPassword = loginPassword;
    }

    public LoginStrategy getLoginStrategy() {
        return loginStrategy;
    }

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }
}
