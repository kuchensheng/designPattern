package com.design.pattern.builder;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/18 16:31
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director(new TextBuilder());
        director.construct();

        director = new Director(new HtmlBuilder());
        director.construct();
    }
}
