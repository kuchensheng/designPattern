package com.design.pattern.builder;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/18 16:19
 */
public class TextBuilder extends  Builder{
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        stringBuffer.append("============================\n")
                    .append(title)
                    .append("\n");
    }

    @Override
    public void makeString(String str) {
        stringBuffer.append("√ ")
                .append(str)
                .append(" \n");
    }

    @Override
    public void makeItems(String[] items) {
        if(null != items && items.length > 0) {
            for (String item : items) {
                stringBuffer.append("    ")
                        .append(item)
                        .append("\n");
            }
        }
        stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("============================\n");
    }

    @Override
    public String getResult() {
        return stringBuffer.toString();
    }
}
