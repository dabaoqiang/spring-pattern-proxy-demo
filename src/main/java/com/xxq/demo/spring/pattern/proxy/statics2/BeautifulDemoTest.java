package com.xxq.demo.spring.pattern.proxy.statics2;

/**
 * @author xiaoqiang
 * @Title: BeautifulDemoTest
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-08 17:35
 */
public class BeautifulDemoTest {
    public static void main(String[] args) {
        SunWuKong sunWuKong = new SunWuKong(new GaoCuiLian());
        sunWuKong.disPlay();

    }
}
