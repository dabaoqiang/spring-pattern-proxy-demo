package com.xxq.demo.spring.pattern.proxy.Cglib;

import com.xxq.demo.spring.pattern.proxy.statics.Father;

/**
 * @author xiaoqiang
 * @Title: CglibDemoTest
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-09 13:59
 */
public class CglibDemoTest {
    public static void main(String[] args) {

        try {
            ZhuBaJie obj = (ZhuBaJie) new CglibProxy().getInstance(ZhuBaJie.class);
            obj.disPlay();
            System.out.println("--------------------------------");
            System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
