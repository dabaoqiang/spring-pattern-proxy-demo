package com.xxq.demo.spring.pattern.simple;

public class DivOperate implements  Operation{
    public double getResult(double numberA, double numberB) throws Exception {
        System.out.println("a/b");
        return numberA /numberB;
    }
}
