package com.xxq.demo.spring.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaoqiang
 * @Title: Sunwukong
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-08 17:40
 */
public class SunwukongProxy implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object target;

    public SunwukongProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是动态的，我会变！");
        Object result = method.invoke(target, args);
        System.out.println("我已变化完成！");
        return result;
    }
}
