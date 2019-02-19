package com.design.pattern.single;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/12/4 13:27
 */
public class SingleInstance {
    private static volatile SingleInstance instance;

    public static SingleInstance getInstance() {
        if(null == instance) {
            synchronized (SingleInstance.class) {
                System.out.println("创建一个单例对象");
                instance = new SingleInstance();
            }
        }
        return instance;
    }

    private SingleInstance() {

    }
}
