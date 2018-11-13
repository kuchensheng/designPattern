package com.design.pattern.simplefactory;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 10:39
 */
public class OperationSub extends AbstractOperation {
    @Override
    public double getResult() {
        return getFirstValue() - getSecondValue();
    }
}
