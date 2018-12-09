package com.xxq.demo.spring.pattern.proxy.dynamic;

import com.xxq.demo.spring.pattern.proxy.statics2.Beautiful;
import com.xxq.demo.spring.pattern.proxy.statics2.GaoCuiLian;

import java.lang.reflect.Proxy;

/**
 * @author xiaoqiang
 * @Title: DynamicDemoTest
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-08 17:54
 */
public class DynamicDemoTest {

    public static void main(String[] args) {

        Beautiful beautiful = new GaoCuiLian();
        SunwukongProxy sunwukongProxy = new SunwukongProxy(beautiful);

        System.out.println(sunwukongProxy.getClass());

        Beautiful beautifulProxy = (Beautiful) Proxy.newProxyInstance(beautiful.getClass().getClassLoader(), beautiful.getClass().getInterfaces(),
                new SunwukongProxy(beautiful));

        System.out.println(beautifulProxy.getClass());

        beautifulProxy.disPlay();
    }
}
