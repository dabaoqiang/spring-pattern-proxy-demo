package com.xxq.demo.spring.pattern.proxy.statics2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author xiaoqiang
 * @Title: SunWuKong
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-08 17:32
 */
public class SunWuKong implements Beautiful {
    /**
     * 孙悟空的变化之道，需要依赖高翠兰
     */
    private GaoCuiLian gaoCuiLian;

    public SunWuKong(GaoCuiLian gaoCuiLian) {
        this.gaoCuiLian = gaoCuiLian;
    }

    public void disPlay() {
        System.out.println("齐天大圣，开始进行变化");
        gaoCuiLian.disPlay();
        System.out.println("大法完成");
    }
}
