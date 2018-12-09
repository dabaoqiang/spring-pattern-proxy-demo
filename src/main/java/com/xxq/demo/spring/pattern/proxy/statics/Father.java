package com.xxq.demo.spring.pattern.proxy.statics;

import com.sun.xml.internal.ws.encoding.soap.streaming.SOAPNamespaceConstants;

/**
 * @author xiaoqiang
 * @Title: Father
 * @ProjectName spring-pattern-demo
 * @Description: TODO
 * @date 2018-12-08 17:20
 */
public class Father {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("物色年龄大于18，小于21的");
        son.findLove();
        System.out.println("做后备工作，联系家长");
    }
}
