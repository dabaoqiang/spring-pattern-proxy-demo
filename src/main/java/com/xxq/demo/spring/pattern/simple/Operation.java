package com.xxq.demo.spring.pattern.simple;

/*
*  简单工厂模式，
*   1.是什么？
*   1.简单工厂模式(Simple Factory Pattern)：又称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
*   在简单工厂模式中，可以根据参数的不同返回不同类的实例。
*   简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
*
*   2.简单工厂模式：定义一个Factory类，可以根据参数的不同返回不同类的实例，被创建的实例通常有共同的父类。
*　　简单工厂模式：只需要一个Factory类。
*　　简单工厂模式：又称为静态工厂模式（Static Factory Pattern），Factory类为静态类或包含静态方法。
*　　简单工厂模式：不属于23种GOF设计模式。
*　　简单工厂模式：实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类实例。
*
*   为什么？
*   例子，使用java实现一个计算机控制台程序，要求输入数的运算，得到结果。
*   public class Computer {
*     public static void main(String[] args) {
*        Scanner in = new Scanner(System.in);
*        System.out.println("请输入第一个数字：");
*        float firstNum  = in.nextFloat();
*        System.out.println("请输入第二个数字：");
*        float secondNum  = in.nextFloat();
*        System.out.println("请输入运算符号：");
*        String countQuato = in.next();
*       if ("+".equals(countQuato)){
*         System.out.println("s : "+(firstNum+secondNum));
*         }else if("-".equals(countQuato)){
*            System.out.println("s : "+(firstNum-secondNum));
*        }else if("*".equals(countQuato)){
*            System.out.println("s : "+(firstNum*secondNum));
*        }else if("/".equals(countQuato)){
*            System.out.println("s : "+(firstNum/secondNum));
*        }
*    }
*
*  上面的写法实现虽然简单，但是却没有面向对象的特性，代码拓展性差，显然不是出题者想要考察的意图。
*  那么面向对象编程要如何在题中体现呢？
*  在面向对象编程语言中，一切都是对象，所以上面运算符号也应当作对象来处理。
*  我们首先建立一个接口
*
*
* */
public interface Operation {

    public double getResult(double numberA, double numberB) throws Exception;
}
