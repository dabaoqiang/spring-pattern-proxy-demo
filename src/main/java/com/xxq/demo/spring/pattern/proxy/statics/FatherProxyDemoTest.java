package com.xxq.demo.spring.pattern.proxy.statics;

/**
 * @author xiaoqiang
 * @Title: FatherProxyDemoTest
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-08 17:23
 */
public class FatherProxyDemoTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
