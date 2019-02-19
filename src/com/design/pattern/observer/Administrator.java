package com.design.pattern.observer;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/19 11:23
 */
public class Administrator extends AbstractRole {
    public Administrator(OrderManage orderManage,String roleName) {
        this.orderManage = orderManage;
        this.roleName = roleName;
        orderManage.attach(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(roleName + "receive OrderManage msg : "+msg);
    }
}
