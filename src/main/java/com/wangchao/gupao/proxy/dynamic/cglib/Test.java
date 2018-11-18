package com.wangchao.gupao.proxy.dynamic.cglib;

import sun.misc.ProxyGenerator;

public class Test {

    public static void main(String[] args) {
        ZhangSan obj = (ZhangSan)new CgLibMeiPo().getInstance(ZhangSan.class);
        obj.findLove();
        System.out.println(obj.getClass());

    }

}
