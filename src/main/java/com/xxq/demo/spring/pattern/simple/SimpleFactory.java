package com.xxq.demo.spring.pattern.simple;

/**
 * 创建工厂，根据名称获取实例
 */
public class SimpleFactory {

    public Operation createOperation(String name) {
        Operation operation = null;
        try {
            if ("+".equals(name)) {
                operation = new AddOperate();
            } else if ("-".equals(name)) {
                operation = new subOperate();
            } else if ("*".equals(name)) {
                operation = new MulOperation();
            } else if ("/".equals(name)) {
                operation = new DivOperate();
            }
        } catch (Exception e) {
            System.out.println("exception :" + e);
        }
        return operation;
    };


}
