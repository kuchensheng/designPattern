package com.design.pattern.simplefactory;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 11:05
 */
public class OperationDiv extends AbstractOperation {
    @Override
    public double getResult() {
        if(0 == getFirstValue() || 0 ==  getSecondValue()) {
            return 0;
        }
        return getFirstValue() / getSecondValue();
    }
}
