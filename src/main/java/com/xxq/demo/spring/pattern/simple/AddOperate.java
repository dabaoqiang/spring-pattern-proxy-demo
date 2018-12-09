package com.xxq.demo.spring.pattern.simple;

public class AddOperate implements Operation {

    public double getResult(double numberA, double numberB) throws Exception {
        System.out.println("添加操作！");
        return numberA + numberB;
    }
}


