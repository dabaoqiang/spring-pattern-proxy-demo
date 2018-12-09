package com.xxq.demo.spring.pattern.proxy.customzied;

import com.xxq.demo.spring.pattern.proxy.statics2.Beautiful;

import java.lang.reflect.Method;

/**
 * @author xiaoqiang
 * @Title: CustomSunWuKong
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-09 11:36
 */
public class CustomSunWuKong implements GPInvocationHandler {
    /**
     * 代理引用
     */
    private Beautiful target;


    public Object getInstance(Beautiful target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是悟空：我要开始演绎无上大法");
        System.out.println("开始演绎");
        Object invoke = method.invoke(this.target, args);
        System.out.println("变化成功！，开始入世！");
        return null;
    }
}
