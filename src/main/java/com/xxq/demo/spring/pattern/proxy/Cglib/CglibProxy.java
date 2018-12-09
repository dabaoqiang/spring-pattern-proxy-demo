package com.xxq.demo.spring.pattern.proxy.Cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xiaoqiang
 * @Title: CglibProxy
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-09 13:51
 */
public class CglibProxy implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception {

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("猪八戒上山");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("猪八戒下手");
        return result;
    }


}
