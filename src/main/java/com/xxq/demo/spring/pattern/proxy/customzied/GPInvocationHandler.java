package com.xxq.demo.spring.pattern.proxy.customzied;

import java.lang.reflect.Method;

/**
 * @author xiaoqiang
 * @Title: GPInvocationHandler
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-09 11:34
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
