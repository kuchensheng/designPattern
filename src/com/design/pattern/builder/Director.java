package com.design.pattern.builder;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/18 16:12
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("我是库达叔");
        builder.makeString("我很帅");
        builder.makeItems(new String[]{"小猪佩奇","猪小屁","流浪地球"});
        builder.close();//完成文档
        System.out.println(builder.getResult());
    }

}
