package com.design.pattern.observer;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/19 11:32
 */
public class TestCase {
    public static void main(String[] args) {
        OrderManage orderManage = new OrderManage();
        new Administrator(orderManage,"管理员");
        new Installers(orderManage,"安装工");

        System.out.println("创建子模块工单创建");
        orderManage.addSubmodule("工单创建");

        System.out.println("创建子模块工单处理");
        orderManage.addSubmodule("工单处理");

    }
}
