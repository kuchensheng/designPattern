package com.design.pattern.simplefactory;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 10:38
 */
public class OperationAdd extends AbstractOperation {

    @Override
    public double getResult() {
        return getFirstValue() + getSecondValue();
    }
}
