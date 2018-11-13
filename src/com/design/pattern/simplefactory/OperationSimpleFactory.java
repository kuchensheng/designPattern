package com.design.pattern.simplefactory;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 10:41
 */
public class OperationSimpleFactory {
    public static AbstractOperation createOperation(String operate) {
        if(null == operate || operate.length() == 0) {
            return null;
        }
        AbstractOperation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
                default:
                    break;
        }
        return operation;
    }
}
