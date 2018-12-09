package com.xxq.demo.spring.pattern.simple;

public class MulOperation implements  Operation {
    public double getResult(double numberA, double numberB) throws Exception {
        System.out.println("进行乘法操作！");
        return numberA * numberB;

    }
}
