package com.design.pattern.simplefactory;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 11:04
 */
public class OperationMul extends AbstractOperation {
    @Override
    public double getResult() {
        return getFirstValue() * getSecondValue();
    }
}
