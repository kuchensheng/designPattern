package com.design.pattern.simplefactory;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 10:37
 */
public abstract class AbstractOperation implements OperationResultIntf {

    private double firstValue;

    private double secondValue;

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }
}
