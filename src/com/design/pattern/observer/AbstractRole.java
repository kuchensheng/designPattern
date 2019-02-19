package com.design.pattern.observer;

/**
 * 抽象观察者类
 * 抽象角色类
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/19 11:22
 */
public abstract class AbstractRole {
    OrderManage orderManage;
    String roleName;

    public abstract void update(String msg);
}
