package com.design.pattern.simplefactory;

import java.util.Scanner;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/11/13 10:40
 */
public class TestMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入操作符：+、-、*、/");
        String operate = scanner.next();
        if(null == operate) {
            System.out.println("输入不合法，请重新输入");
            main(null);
        }
        AbstractOperation operation = null;
        try {
            operation = OperationSimpleFactory.createOperation(operate);
            double first  = inputValue();
            double second = inputValue();
            operation.setFirstValue(first);
            operation.setSecondValue(second);
            System.out.println("获得结果"+operation.getResult());


            if(isContinue()) {
                main(null);
            }
        } catch (Exception e) {
            System.out.println("出错啦"+e);
            if(isContinue()) {
                main(null);
            }
        }

    }

    private static boolean isContinue() {
        System.out.print("是否继续？（y/n）");
        String s = scanner.next();
        if(null == s || s.trim().length() == 0) {
            System.out.println("输入内容="+s+"输入不合法，请重新输入");
            isContinue();
        }
        if("Y".equals(s.toUpperCase())) {
            return true;
        }
        return false;
    }

    private static double inputValue() {
        System.out.print("请输入值:");
        Double first = scanner.nextDouble();
        if(null == first) {
            System.out.println("输入不合法，请重新输入");
            inputValue();
        }
        return first;
    }
}
