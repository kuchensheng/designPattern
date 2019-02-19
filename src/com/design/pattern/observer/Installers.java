package com.design.pattern.observer;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/19 11:30
 */
public class Installers extends AbstractRole {
    public Installers(OrderManage manage,String roleName) {
        this.orderManage = manage;
        this.roleName = roleName;
        manage.attach(this);
    }

    @Override
    public void update(String msg) {
        if(msg.contains("工单")) {
            System.out.println(roleName+"receive OrderManage msg:"+msg);
        }
    }
}
