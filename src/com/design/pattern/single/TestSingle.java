package com.design.pattern.single;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2018/12/4 13:30
 */
public class TestSingle {

    private static final ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        List<SingleInstance> instances = new ArrayList<>(100);
        for (int i=0;i< 100;i++) {
            Future<SingleInstance> submit = pool.submit(new Callable<SingleInstance>() {
                @Override
                public SingleInstance call() throws Exception {
                    System.out.println("获取实例，线程="+Thread.currentThread().getName());
                    return SingleInstance.getInstance();
                }
            });

            try {
                instances.add(submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("实例获取完毕");
        int i = 1;
        for (SingleInstance instance : instances) {
            System.out.println("开始比较第"+i+"个的值");
            for (SingleInstance result : instances) {
                if(instance !=  result) {
                    System.out.println("这两个对象不是相同实例");
                    break;
                }
            }

            System.out.println("第"+i+"个值和所有的值都是相同实例");
            i ++;
        }

        pool.shutdown();
    }
}
