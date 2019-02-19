package com.design.pattern.builder;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/18 16:14
 */
public class Product {
    private String title;
    private String str;
    private String[] items;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}
