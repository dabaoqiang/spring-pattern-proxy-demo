package com.xxq.demo.spring.pattern.simple;

/**
 * 简单工厂将对象的创建过程进行了封装，用户不需要知道具体的创建过程，只需要调用工厂类获取对象即可。
 *
 * 这种简单工厂的写法是通过switch-case来判断对象创建过程的。
 * 在实际使用过程中，违背了 开放-关闭原则，当然有些情况下可以通过反射调用来弥补这种不足。
 *
 */
public class SimpleFactoryPatternTest {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        SimpleFactory simpleFactory = new SimpleFactory();
        Operation operation = simpleFactory.createOperation("+");

        try {
            double num = operation.getResult(a, b);
            System.out.println(num);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
