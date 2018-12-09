package com.xxq.demo.spring.pattern.simple;

public class subOperate implements  Operation {
    public double getResult(double numberA, double numberB) throws Exception {
        System.out.println("进行减法操作！");
        return numberA - numberB;
    }
}
