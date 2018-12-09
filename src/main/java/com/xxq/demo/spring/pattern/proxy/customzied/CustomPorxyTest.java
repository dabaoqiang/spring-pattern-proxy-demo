package com.xxq.demo.spring.pattern.proxy.customzied;

import com.xxq.demo.spring.pattern.proxy.statics2.Beautiful;
import com.xxq.demo.spring.pattern.proxy.statics2.GaoCuiLian;

/**
 * @author xiaoqiang
 * @Title: CustomPorxyTest
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-09 12:22
 */
public class CustomPorxyTest {
    public static void main(String[] args) {
        try {
            Beautiful obj =  (Beautiful) new CustomSunWuKong().getInstance(new GaoCuiLian());
            System.out.println(obj.getClass());
            obj.disPlay();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
