package com.design.pattern.builder;

/**
 * Builder类是一个声明了编写文档的方法的抽象类。
 * makeTitle:编写标题
 * makeString：编写字符串
 * makeItems：编写条目
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/18 16:09
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();

    public abstract String getResult();
}
